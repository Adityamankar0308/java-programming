import java.util.*;

public class MaxSumArray {

    public static void SubArraySum(int num[]) {
        int Maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {

                int Currsum = 0; // reset for each subarray

                // Sum subarray from i to j
                for (int k = i; k <= j; k++) {
                    Currsum += num[k];
                }

                System.out.println("Current sum is " + Currsum);

                if (Currsum > Maxsum) {
                    Maxsum = Currsum;
                }
            }
        }

        System.out.println("Max sum is = " + Maxsum);
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        SubArraySum(num);
    }
}
