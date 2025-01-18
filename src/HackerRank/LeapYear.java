package HackerRank;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        if((n%4==0 && n%100!=0)||n%400==0)
            System.out.println("Leap Year");
        else
            System.out.println("Not a leap year");

    }
}
