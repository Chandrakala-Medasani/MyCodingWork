package SecondBatch;
import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args){
        Prime1 p = new Prime1();
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        System.out.println(p.isPrime(num));
    }
}
