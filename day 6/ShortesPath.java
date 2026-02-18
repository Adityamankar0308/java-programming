import java.util.*;
public class ShortesPath {
    public static void shortestPath(String name){
        int x=0,y=0;
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch == 'R'){
                x++;
            } else if(ch == 'L'){
                x--;
            } else if(ch == 'U'){
                y++;
            } else if(ch == 'D'){
                y--;
            }
        }
        int distance = (int) Math.sqrt(x*x + y*y);
        System.out.println("Shortest distance from origin: " + distance);
    }
    public static void main(String args[]){
        String name = "RUU";
        shortestPath(name);
    }
    
}
