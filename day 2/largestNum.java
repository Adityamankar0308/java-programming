import java.util.*;

public class largestNum {

    public static int LagNum(int Num[]) {

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        // loop through array
        for (int i = 0; i < Num.length; i++) {

            // check largest
            if (largest < Num[i]) {
                largest = Num[i];
            }

            // check smallest
            if (smallest > Num[i]) {
                smallest = Num[i];
            }
        }

        System.out.println("Smallest number is: " + smallest);

        return largest;
    }

    public static void main(String[] args) {

        int Num[] = {2, 4, 6, 8, 10, 12, 14};

        System.out.println("Largest number is: " + LagNum(Num));
    }
}
