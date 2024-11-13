package Programs;
import java.util.*;

public class FirstDigit {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num=scr.nextInt();
        int rem=0;
        while(num>0){
            rem=num%10;
            num=num/10;
        }
        System.out.print(rem);
    }
}
