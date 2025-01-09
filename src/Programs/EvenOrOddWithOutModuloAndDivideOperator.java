package Programs;
import java.util.Scanner;

public class EvenOrOddWithOutModuloAndDivideOperator {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();

        while(num>0)
            num-=2;

        if(num == 0)
            System.out.print("Even");
        else
            System.out.print("Odd");

    }
}
