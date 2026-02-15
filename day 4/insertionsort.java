import java.util.*;

public class insertionsort {

    public static void insertionsort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            int curr = arr[i];
            int prev = i - 1;

            // shifting elements to the right
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // inserting current element at correct position
            arr[prev + 1] = curr;
        }
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        insertionsort(arr);
        printarr(arr);
    }
}
