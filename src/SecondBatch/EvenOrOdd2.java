package SecondBatch;
import java.util.*;

public class EvenOrOdd2 {
    public static void main(String[] args){
        EvenOrOdd1 e = new EvenOrOdd1();
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        System.out.println(e.isEven(num));
    }
}
