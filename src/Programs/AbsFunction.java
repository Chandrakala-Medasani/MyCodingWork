package Programs;
import java.util.*;

// to print the absolute value

public class AbsFunction {

    public static void main(String[] args){

        /*int a = -5;
        System.out.println(a);
        System.out.println(Math.abs(a));*/


        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scr.nextInt();

        System.out.println("The original value is : "+num);
        System.out.println("The value after applying abs function is : "+Math.abs(num));


    }
}
