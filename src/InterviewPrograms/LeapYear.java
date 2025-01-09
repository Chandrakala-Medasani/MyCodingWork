package InterviewPrograms;
import java.util.Scanner;

//Check if a given year is a leap year.

public class LeapYear {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int year = scr.nextInt();

        if(year%4 == 0)
            System.out.println(year+" is leap year");
        else
            System.out.println(year+" is non leap year");
    }
}

/*Result:-

2024
2024 is leap year

2027
2027 is non leap year
 */
