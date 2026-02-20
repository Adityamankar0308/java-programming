import java.util.*;

public class Operations {

    public static int getIthBit(int i, int n) {
        int bitwise = 1 << i;   // create mask
        if ((n & bitwise) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int i, int n) {
        int bitwise = 1 << i;
        return n | bitwise;   // set the ith bit of n
    }
     public static int clearIthBit(int i, int n) {
        int bitwise = ~ (1 << i);
        return n & bitwise; 
     } 

    public static void main(String[] args) {
        int result = getIthBit(1, 5);
        System.out.println(result);

        int result1 = setIthBit(1, 5);  // set 1st bit of 5
        System.out.println(result1);

        int result2 = clearIthBit(1, 10);  // set 1st bit of 5
        System.out.println(result2);
    }
}
