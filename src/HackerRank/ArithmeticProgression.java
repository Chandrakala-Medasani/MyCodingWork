package HackerRank;
import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int d = scr.nextInt();
        int n = scr.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum+a;
            a=a+d;
        }
        System.out.println(sum);
    }
}
