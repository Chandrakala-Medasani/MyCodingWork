package Programs;
import java.util.*;

//factorial of a given number

public class Factorial {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int fact=1;
        for(int i=1; i<=num; i++)
            fact = fact*i;
        System.out.println("Factorial = "+fact);
    }
}
