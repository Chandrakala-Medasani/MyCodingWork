package SecondBatch;
import java.util.Scanner;

//with return type and without arguments
public class Palindrome3 {
    public String isPalin(){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int rev = 0;
        int temp = num;
        while(num>0){
            int rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        if(temp == rev)
            return "palindrome";
        else
            return "not palindrome";
    }

}
