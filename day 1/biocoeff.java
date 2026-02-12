 import java.util.Scanner;
public class biocoeff {


    public static int factorial(int n) {
        int f=1;

        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;

    }

    public static int biocoeff(int n,int  r) 
    {
        int n_fac = factorial(n);
        int r_fac = factorial(r);
        int nmr_fac  = factorial(n-r);

        int biocoeff= (n_fac / (r_fac *nmr_fac));
        return biocoeff;
        
    }
    public static void main(String[] args) {
       
        System.out.println(biocoeff(5, 2));
        
    }
    
}

    

