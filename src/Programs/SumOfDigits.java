package Programs;
import java.util.*;

//sum of the individual digits of a number
public class SumOfDigits {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int sum = 0;
        while(num>0){
            int rem=num%10;
            sum = sum + rem;
            num/=10;
        }
        System.out.println("Sum = "+sum);
    }
}
