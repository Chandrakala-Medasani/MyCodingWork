package SecondBatch;
import java.util.Scanner;
//without return type and without arguments
public class ReverseNumber5 {
    public void reverse(){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int rev=0;
        while(num>0){
            int rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        System.out.println(rev);
    }
}
