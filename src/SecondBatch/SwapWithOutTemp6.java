package SecondBatch;
import java.util.Scanner;

public class SwapWithOutTemp6 {
    public static void main(String[] args){
        SwapWithOutTemp5 s = new SwapWithOutTemp5();
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        System.out.println(s.swap(a,b));
    }
}
