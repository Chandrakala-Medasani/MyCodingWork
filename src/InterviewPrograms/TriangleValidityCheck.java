package InterviewPrograms;
import java.util.Scanner;

//Triangle validity check

public class TriangleValidityCheck {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();

        if((b+c)>a && (a+c)>b && (a+b)>c)
            System.out.println("It is triangle");
        else
            System.out.println("It is not a triangle");
    }
}

/*
Result:-

3
4
5
It is a triangle

3
1
1
It is not a triangle


 */
