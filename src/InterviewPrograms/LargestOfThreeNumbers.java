package InterviewPrograms;
import java.util.Scanner;

//Largest of three numbers

public class LargestOfThreeNumbers {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();

        if(a>b && a>c)
            System.out.println(a+" is largest");
        else if(b>a && b>c)
            System.out.println(b+" is largest");
        else
            System.out.println(c+" is largest");
    }
}

/*
Result:-

5
6
7
7 is largest

100
54
98
100 is largest

78
125
45
125 is largest
 */