package HackerRank;
import java.util.Scanner;


public class Palindrome {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int  num = scr.nextInt();
        int rev = 0;
        int temp = num;

        while(num>0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if(temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
