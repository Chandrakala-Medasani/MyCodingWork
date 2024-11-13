package SecondBatch;
import java.util.*;

public class Factorial {
    public static int fact(int n){
        int fact = 1;
        for(int i=1; i<=n; i++)
            fact*=i;
        return fact;
    }

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        System.out.println(fact(n));
    }
}
