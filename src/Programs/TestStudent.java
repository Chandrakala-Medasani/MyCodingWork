package Programs;

import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args){

/*        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();*/

        Student[] s = new Student[2];
        s[0]= new Student(7, "Uchiha");
        s[1]= new Student(77, "Uchiha");

        System.out.println(s[0].id);
        System.out.println(s[0].name);

    }
}
