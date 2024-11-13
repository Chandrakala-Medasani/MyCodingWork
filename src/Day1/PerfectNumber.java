package Day1;
import java.util.*;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int sum = 0;
        for(int i=1; i<=num/2; i++){
            if(num%i==0)
                sum = sum+i;
        }
        if(sum == num)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");

    }
}
