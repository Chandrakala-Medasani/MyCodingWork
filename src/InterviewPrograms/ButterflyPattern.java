package InterviewPrograms;
import java.util.Scanner;

//butterfly pattern

public class ButterflyPattern {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
                System.out.print("*");
        }
    }
}
