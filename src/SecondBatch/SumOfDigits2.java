package SecondBatch;
import java.util.*;

public class SumOfDigits2 {
    public static void main(String[] args){
        SumOfDigits1 s = new SumOfDigits1();
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        System.out.println(s.sum(num));
    }
}
