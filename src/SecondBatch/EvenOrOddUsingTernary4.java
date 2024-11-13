package SecondBatch;
import java.util.Scanner;

public class EvenOrOddUsingTernary4 {
    public static void main(String[] args){
        EvenOrOddUsingTernary3 e = new EvenOrOddUsingTernary3();
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        e.isEven(num);
    }
}
