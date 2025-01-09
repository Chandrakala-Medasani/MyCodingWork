package Programs;
import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();

        for(int i=1; i<=num; i++) {
            for (int j = 1; j <= num - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                if(i%2 != 0)
                    System.out.print("* ");

            System.out.println();
        }

        for(int i=3;i<=num;i++){
            for(int j=1;j<=num-i-1;j++)
                System.out.print(" ");
            for(int j=i; j>=1; j--)
                if(i%2 != 0)
                    System.out.print("* ");

            System.out.println();
        }

    }
}
