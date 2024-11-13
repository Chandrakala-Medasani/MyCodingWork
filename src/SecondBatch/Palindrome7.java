package SecondBatch;
import java.util.*;
//without return type and without arguments

public class Palindrome7 {
    public void isPalin() {
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int temp = num;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}

