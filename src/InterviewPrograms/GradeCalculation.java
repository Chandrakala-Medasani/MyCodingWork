package InterviewPrograms;
import java.util.Scanner;

//Grade calculation

public class GradeCalculation {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int marks = scr.nextInt();

        if(marks>70)
            System.out.println("Grade A");
        else if(marks>60 && marks<=70)
            System.out.println("Grade B");
        else if(marks>50 && marks<=60)
            System.out.println("Grade C");
        else
            System.out.println("Fail");
    }
}

/*

52
Grade C

40
Fail

85
Grade A

67
Grade B
 */