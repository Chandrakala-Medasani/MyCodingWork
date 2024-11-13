package SecondBatch;
import java.util.Scanner;

public class ReverseNumber4 {
    public static void main(String[] args){
        ReverseNumber3 r = new ReverseNumber3();
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        r.reverse(num);
    }
}
