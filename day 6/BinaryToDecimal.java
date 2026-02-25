import java.util.Scanner;

public class BinaryToDecimal {

    public static int convertBinaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        // Traverse from right to left
        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = binary.charAt(i) - '0';
            decimal += digit * Math.pow(2, power);
            power++;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        int decimal = convertBinaryToDecimal(binary);

        System.out.println("Decimal value: " + decimal);

        scanner.close();
    }
}