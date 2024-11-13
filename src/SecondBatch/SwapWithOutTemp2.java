package SecondBatch;
import java.util.Scanner;

public class SwapWithOutTemp2 {
    public static void main(String[] args){
        SwapWithOutTemp1 s = new SwapWithOutTemp1();
        Scanner scr = new Scanner(System.in);
        int num1 = scr.nextInt();
        int num2 = scr.nextInt();
        s.swap(num1,num2);

    }
}
