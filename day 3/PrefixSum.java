import java.util.*;

public class PrefixSum {

    public static void PrefixSum(int num[]) {

        int Maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        // Build prefix sum array
        prefix[0] = num[0];
        for (int i = 1; i < num.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        // Find max subarray sum
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {

              int Currsum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];

                if (Currsum > Maxsum) {
                    Maxsum = Currsum;
                }
            }
        }

        System.out.println("Max sum is = " + Maxsum);
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        PrefixSum(num);
    }
}
