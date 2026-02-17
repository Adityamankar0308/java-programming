import java.util.*;

public class matrix {

    public static boolean search(int matrix[][], int key) {

        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key found at position: (" + i + ", " + j + ")");
                    return true;
                }
            }
        }

        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[]) {

        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        int n = matrix.length;
        int m = matrix[0].length;

        // Input
        System.out.println("Enter 9 elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print Matrix
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Search for 5
        search(matrix, 5);

        
    }
}
