package SecondBatch;
import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args){
        Palindrome1 p = new Palindrome1();
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        System.out.println(p.isPalin(num));
    }
}
