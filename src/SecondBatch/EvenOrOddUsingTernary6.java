package SecondBatch;
import java.util.Scanner;

public class EvenOrOddUsingTernary6 {
    public static void main(String[] args){
        EvenOrOddUsingTernary5 e = new EvenOrOddUsingTernary5();
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        System.out.println(e.isEven(num));
    }
}
