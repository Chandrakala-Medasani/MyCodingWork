package Ranges;
import java.util.*;

public class ArmstrongNumbers {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the starting range :");
        int start = scr.nextInt();
        System.out.println("Enter the ending range :");
        int end = scr.nextInt();
        for(int i=start; i<=end; i++){
            int num=i;
            int temp=num;
            int rev=0;
            for(;num>0;){
                int rem = num%10;
                rev = rev+rem*rem*rem;
                num = num/10;
            }
            if(temp == rev)
                System.out.println(i);
        }

    }
}
