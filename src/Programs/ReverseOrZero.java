package Programs;
import java.util.*;

public class ReverseOrZero {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int temp = num;
        int x = Math.abs(num);
        int rev = 0;
        while(x>0){
            int rem = x%10;
            rev = rev*10+x;
            x=x/10;
        }
        if(temp<0)
         System.out.println(rev);
    }
}
