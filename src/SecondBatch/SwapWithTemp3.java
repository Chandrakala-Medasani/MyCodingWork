package SecondBatch;
import java.util.Scanner;
//without return type and without arguments
public class SwapWithTemp3 {
    public void swap(){
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+"\t"+b);
    }
}
