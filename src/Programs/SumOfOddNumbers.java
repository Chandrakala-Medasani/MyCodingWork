package Programs;
import java.util.*;

//sum of odd numbers

public class SumOfOddNumbers {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int sum=0;
        for(int i=1; i<=num; i++){
            if(i%2==1)
                sum = sum+i;
        }
        System.out.println("Sum = "+sum);
    }
}
