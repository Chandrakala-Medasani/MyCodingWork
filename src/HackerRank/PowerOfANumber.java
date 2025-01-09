package HackerRank;
import java.util.Scanner;

public class PowerOfANumber {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int p = scr.nextInt();

        int res = 1;

        for(int i=1; i<=p; i++)
            res = res*n;

        System.out.println(res);

    }
}
