import java.util.*;
public class OddorEven {
    public static void OddorEven(int n) {
        int bitwise =1 ;
        if((n & bitwise) == 0)

        {
            System.out.println("even number");
        }else
        {
            System.out.println("odd number");
        }
        
    }

    public static void main(String[] args) {
        OddorEven(12);
        OddorEven(6);
        OddorEven(3);
    }
    
}
