package SecondBatch;
import java.util.Scanner;

public class Prime6 {
    public static void main(String[] args){
        Prime5 p = new Prime5();
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        p.isPrime(num);
    }
}
