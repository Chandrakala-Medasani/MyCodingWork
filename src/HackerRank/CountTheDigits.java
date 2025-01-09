package HackerRank;
import java.util.Scanner;

public class CountTheDigits {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        int count = 0;

        while(n>0){
            n/=10;
            count++;
        }

        System.out.println(count);

    }
}
