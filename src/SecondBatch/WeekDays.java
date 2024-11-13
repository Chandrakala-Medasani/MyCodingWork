package SecondBatch;
import java.util.*;

public class WeekDays {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        switch(n){
         case 1: System.out.println("Sunday");
            break;
         case 2: System.out.println("Monday");
            break;
            case 3: System.out.println("Tuesday");
            break;
            case 4: System.out.println("wednesday");
            break;
            case 5: System.out.println("Thursday");
                break;
            case 6: System.out.println("Friday");
                break;
            case 7: System.out.println("Saturday");
                break;
            default :
                System.out.println("Enter valid number");
    }
}
}