package HackerRank;
import java.util.Scanner;

public class Gcd {

    public static void main(String[] args){

        Scanner scr =new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();

        int gcd = 1;

        for(int i=2; i<=a && i<=b; i++){
            if(a%i == 0 && b%i ==0)
                gcd = i;
        }

        System.out.print(gcd);
    }
}
