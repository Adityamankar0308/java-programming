import java.util.*;

public class SubArray {

    public static void SubArray(int num[]) {
        int ts = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {

                // Print subarray from i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                }

                ts++;
                System.out.println();
            }
        }

        System.out.println("Total subarrays are = " + ts);
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        SubArray(num);
    }
}
