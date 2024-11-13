package SecondBatch;
import java.util.Scanner;
//without return type and without arguments
public class SwapWithOutTemp3 {
    public void swap(){
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        a = a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+"\t"+b);
    }
}
