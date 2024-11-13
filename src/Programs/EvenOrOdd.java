package Programs;
import java.util.*;
//Whether a given num is even or odd

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scr.nextInt();
        if(num%2==0)
            System.out.println(num+" is even number");
        else
            System.out.println(num+" is odd number");
    }
}