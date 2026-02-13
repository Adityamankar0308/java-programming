import java.util.*;

public class binarySec {

    public static int binsec(int num[], int key) {

        int start = 0, end = num.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            // ✅ Correct comparison
            if (num[mid] == key) {
                return mid;
            }

            if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int num[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int key = 12;

        System.out.println("index of key is " + binsec(num, key));
    }
}
