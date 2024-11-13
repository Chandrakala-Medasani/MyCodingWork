package Programs;
import java.util.*;

//palindrome or not
public class Palindrome {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int temp = num;
        int rev=0;
        while(num>0){
           int rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        if(temp==rev)
            System.out.println("It is palindrome");
        else
            System.out.println("It is not palindrome");
    }
}
