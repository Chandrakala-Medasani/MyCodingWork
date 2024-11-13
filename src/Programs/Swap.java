package Programs;
import java.util.*;
//swapping without 3rd variable
public class Swap {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping : "+a+"\t"+b);
    }
}
