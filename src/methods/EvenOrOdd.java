package methods;
import java.util.*;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num=scr.nextInt();
        method(num);
    }
    public static void method(int num){
        if(num%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }
}
