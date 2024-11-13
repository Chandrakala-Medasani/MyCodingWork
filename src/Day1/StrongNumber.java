package Day1;
import java.util.*;

public class StrongNumber {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int temp =num;
        int sum=0;
        for(;num>0;){
            int rem = num%10;
            sum = sum + fact(rem);
            num = num/10;
        }
        if(sum == temp)
            System.out.println("Strong number");
        else
            System.out.println("Not a strong number");

    }
    public static int fact(int num){
        int fac = 1;
        for(int i=1; i<=num; i++)
            fac = fac*i;
        return fac;
    }
}
