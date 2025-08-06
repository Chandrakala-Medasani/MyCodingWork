package Programs;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
//        int age = scr.nextInt();
//        int marks = scr.nextInt();

       int age=19;
       int marks=75;

        if(age>=18){
            if(marks>70){
                System.out.println(str+" Eligible for scholarship");
            }
            else{
                System.out.println(str+" Not eligible for scholarship");
            }
        }
        else{
            System.out.println(str+ " Under 18");
        }
    }
}
