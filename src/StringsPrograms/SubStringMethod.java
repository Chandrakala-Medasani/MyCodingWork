package StringsPrograms;
import java.util.Scanner;

public class SubStringMethod {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        int start = scr.nextInt();
        int end = scr.nextInt();

        System.out.println(str.substring(start));

        System.out.println(str.substring(start,end));
    }
}

/*
chandra kala
3
10
ndra kala
ndra ka

 */