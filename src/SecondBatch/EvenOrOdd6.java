package SecondBatch;
import java.util.Scanner;

public class EvenOrOdd6 {
    public static void main(String[] args){
        EvenOrOdd5 e = new EvenOrOdd5();
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        e.isEven(num);
    }
}
