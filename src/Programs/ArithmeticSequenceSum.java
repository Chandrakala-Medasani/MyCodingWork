package Programs;
import java.util.Scanner;

//Arithmetic progression
//a=2 (starting number)
//d=3 (difference)
//n=5 (no.of terms)
//2 5 8 11 14 ==> 40

public class ArithmeticSequenceSum {

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int d = scr.nextInt();
        int n = scr.nextInt();

        int sum = 0;

        for(int i=1; i<=n; i++){
            sum+=a;
            a+=d;
        }

        System.out.println(sum);

    }
}
