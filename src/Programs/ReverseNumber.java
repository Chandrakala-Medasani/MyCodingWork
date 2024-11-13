package Programs;
import java.util.*;

//Reverse of a number

public class ReverseNumber {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int temp = num;
        int rev = 0;
        while(num>0){
            int rem = num%10;
             rev = rev*10+rem;
            num=num/10;
        }
        if(temp%10 == 0)
            System.out.println("Reverse = "+"0"+rev);
        else
            System.out.println("Reverse = "+rev);
    }
}
