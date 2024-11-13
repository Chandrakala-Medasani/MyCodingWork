package SecondBatch;
import java.util.*;
//with return type and without arguments
public class Prime3 {
    public String isPrime(){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int flag = 0;
        for(int i=1; i<=num/2; i++){
            if(num%i == 0)
                flag++;
        }
        if(flag == 1)
            return "Prime";
        else
            return "Not Prime";
    }
}
