package SecondBatch;

import java.util.Scanner;

//without return type and without arguments
public class EvenOrOdd7 {
    public void isEven(){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        if(num%2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
