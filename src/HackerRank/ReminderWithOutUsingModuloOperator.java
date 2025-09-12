package HackerRank;
import java.util.Scanner;

public class ReminderWithOutUsingModuloOperator {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int dividend = scr.nextInt();
        int divisor = scr.nextInt();

        System.out.println(dividend -((divisor*(dividend/divisor))));
    }
}
