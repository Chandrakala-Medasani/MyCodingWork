package Programs;
import java.util.Scanner;

//to check whether given numbers are co primes or not

public class CoPrime {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();

        int check=0;

        for(int i=2; i<=a && i<=b; i++) {
            if (a % i == 0 && b % i == 0) {
                check = 1;
                break;
            }
        }

            if(check == 1)
                System.out.println("false");
            else
                System.out.println("true");

    }
}
