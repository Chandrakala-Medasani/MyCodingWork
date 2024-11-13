package Day1;
import java.util.*;


public class StrongNumberOrNot {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int temp =num;
        int sum=0;
        for(;num>0;){
            int rem = num%10;
            int fact = 1;
            for(int i=1; i<=rem; i++)
                fact = fact*i;
            sum = sum +fact;
            num = num/10;
        }
        if(temp == sum)
            System.out.println("Strong number");
        else
            System.out.println("Not a strong number");
    }
}
