package SecondBatch;
import java.util.Scanner;

public class Armstrong2 {
    public static void main(String[] args){
        Armstrong1 a = new Armstrong1();
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        System.out.println(a.isArmstrong(num));
    }
}
