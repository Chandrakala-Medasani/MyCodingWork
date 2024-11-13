package Programs;
import java.util.*;

// leap year or not
public class LeapYearOrNot {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int year = scr.nextInt();
        if(year%4==0)
            System.out.println("It is leap year");
        else
            System.out.println("It is not leap year");

    }
}
