package Programs;
import java.util.*;

//Check whether given number is armstrong number or not

public class ArmstrongNumber {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int temp = num;
        int rev = 0;

        while(num>0){
            int rem = num%10;
            rev = rev + rem*rem*rem;
            num = num/10;
        }

        if(temp == rev)
            System.out.println("It is armstrong number");
        else
            System.out.println("It is not armstrong number");

    }
}
