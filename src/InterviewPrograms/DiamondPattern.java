package InterviewPrograms;
import java.util.Scanner;

//Diamond pattern

public class DiamondPattern {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++)
                System.out.print(" ");
            for(int j=1; j<=2*i-1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        for(int i=2; i<=n; i++){
            for(int j=1; j<i; j++)
                System.out.print(" ");
            for(int j=1; j<=2*i-1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

    }
}
