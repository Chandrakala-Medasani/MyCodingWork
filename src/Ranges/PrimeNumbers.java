package Ranges;
import java.util.*;

public class PrimeNumbers {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the stating range : ");
        int start = scr.nextInt();
        System.out.println("Enter the ending range : ");
        int end = scr.nextInt();
        for(int i=start; i<=end; i++){
            int temp=0;
            for(int num=1;num<=i;num++) {
                if (i % num == 0) {
                    temp++;
                }
            }
            if(temp==2)
                System.out.print(i+"\t");
        }
    }
}
