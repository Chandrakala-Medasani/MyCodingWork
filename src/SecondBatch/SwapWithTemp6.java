package SecondBatch;
import java.util.Scanner;
public class SwapWithTemp6 {
    public static void main(String[] args){
        SwapWithTemp5 s = new SwapWithTemp5();
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        System.out.println(s.swap(a,b));
    }
}
