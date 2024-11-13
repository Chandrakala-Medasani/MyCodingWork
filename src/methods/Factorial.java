package methods;
import java.util.*;

public class Factorial {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        System.out.println(fact(num));
    }

    public static int fact(int num){
        int fact=1;
        for(int i=1;i<=num;i++)
            fact = fact*i;
        return fact;
    }
}
