package HackerRank;
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int rev = 0;
        while(n>0){
            rev = rev*10 + (n%10);
            n/=10;
        }

       System.out.println(rev);

    }
}
