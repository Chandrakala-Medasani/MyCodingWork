package SecondBatch;
import java.util.Scanner;

public class Palindrome6 {
    public static void main(String[] args) {
        Palindrome5 p = new Palindrome5();
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        p.isPalin(num);
    }
}
