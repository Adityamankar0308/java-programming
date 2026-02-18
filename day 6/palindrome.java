import java.util.*;

public class palindrome {

    public static boolean palindrome(String name) {

        int n = name.length();

        for (int i = 0; i < n / 2; i++) {

            if (name.charAt(i) != name.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {

        String str = "madam";

        if (palindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
