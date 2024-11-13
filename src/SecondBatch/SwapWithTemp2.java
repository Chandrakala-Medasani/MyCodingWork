package SecondBatch;
import java.util.Scanner;

public class SwapWithTemp2 {
    public static void main(String[] args) {
        SwapWithTemp1 s = new SwapWithTemp1();
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        s.swap(a,b);
    }

}
