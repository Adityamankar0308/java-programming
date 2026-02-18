import java.util.*;
public class subbstring {
    public static String sunstring(String name,int si,int ei){
        String sub = "";
        for(int i=si;i<ei;i++){
            sub = sub + name.charAt(i);
        }
        return sub;
    }
    public static void main(String[] args) {
        String name = "aditya";
        int si = 0;
        int ei = 3;
        String sub = sunstring(name,si,ei);
        System.out.println(sub);
    }
    
}
