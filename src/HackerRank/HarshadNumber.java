package HackerRank;
import java.util.*;

public class HarshadNumber {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int temp = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum+rem;
            n/=10;
        }
        if(temp%sum == 0)
            System.out.println("true");
        else
            System.out.println("false");

    }
}
