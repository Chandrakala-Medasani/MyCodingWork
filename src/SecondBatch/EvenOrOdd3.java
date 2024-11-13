package SecondBatch;
import java.util.Scanner;
//with return type and without arguments
public class EvenOrOdd3 {
    public String isEven(){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        if(num%2 == 0)
            return "Even";
        else
            return "Odd";
    }
}
