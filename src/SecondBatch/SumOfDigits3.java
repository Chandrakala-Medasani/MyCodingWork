package SecondBatch;
import java.util.*;
//with return type and without arguments
public class SumOfDigits3 {
    public int sum(){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum = sum + rem;
            num = num/10;
        }
        return sum;
    }
}
