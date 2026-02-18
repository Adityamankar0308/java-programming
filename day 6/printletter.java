import java.util.*;
public class printletter {
    public static void printletter(String name) {
        for(int i=0;i<name.length();i++){
            System.err.println(name.charAt(i) + "");
        }
    }
    public static void main(String args[]){
        String name= "aditya";
        printletter(name);
    }
    
}
