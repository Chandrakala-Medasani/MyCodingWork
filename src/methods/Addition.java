package methods;
import java.util.*;

public class Addition {
    public static void main(String[] args){
        Addition a = new Addition();
        Scanner scr = new Scanner(System.in);
        int x=scr.nextInt();
        int y=scr.nextInt();
        System.out.println(a.add(x,y));
    }

    public int add(int a, int b){
        return a+b;
        //System.out.println("Sum");
    }
}
