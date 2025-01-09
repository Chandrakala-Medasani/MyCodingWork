package InterviewPrograms;
import java.util.Scanner;

//Sand glass pattern

public class SandGlassPattern {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<i; j++)
                System.out.print(" ");
            for(int j=1; j<=n-i+1; j++)
                System.out.print("* ");

            System.out.println();
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++)
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print("* ");

            System.out.println();
        }

    }
}

/*

Result:-
4
* * * *
 * * *
  * *
   *
   *
  * *
 * * *
* * * *
 */