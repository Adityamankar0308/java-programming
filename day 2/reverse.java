import java.util.*;

public class reverse {

    public static void reverse(int num[]) {

        int start = 0, end = num.length - 1;

        while (start < end) {

            // swap
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int num[] = {2, 4, 6, 8, 10, 12, 14};

        reverse(num);

        System.out.print("Reversed array is: ");

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
