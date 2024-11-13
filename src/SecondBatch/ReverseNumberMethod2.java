package SecondBatch;
import java.util.Scanner;

public class ReverseNumberMethod2 {
    public static void main(String[] args){
        ReverseNumberMethod1 r = new ReverseNumberMethod1();
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        System.out.println(r.reverse(n));
    }
}
