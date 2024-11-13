package SecondBatch;
import java.util.*;
//without return type and without arguments
public class SumOfDigits7 {
    public void sum(){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int sum = 0;
        while(num > 0){
            int rem = num%10;
            sum = sum + rem;
            num = num/10;
        }
        System.out.println(sum);
    }
}
