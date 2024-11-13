package Ranges;
import java.util.*;

public class StrongNumbers {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter starting range : ");
        int start = scr.nextInt();
        System.out.println("Enter ending range : ");
        int end = scr.nextInt();
        for(int i=start; i<=end; i++){
            int num=i;
            int temp=num;
            int sum=0;
            for(;num>0;){
                int rem = num%10;
                int fact=1;
                for(int k=1; k<=rem; k++)
                    fact=fact*k;
                sum=sum+fact;
                num=num/10;
            }
            if(temp == sum)
                System.out.println(i);
        }
    }
}
