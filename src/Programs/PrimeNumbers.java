package Programs;
import java.util.*;
//print the prime numbers
public class PrimeNumbers {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int temp = 0;
        for(int i=1; i<=num/2; i++){
            if(num%i == 0)
                temp++;
        }
        if(temp == 1)
            System.out.println("It is prime");
        else
            System.out.println("It is not prime");
    }
}
