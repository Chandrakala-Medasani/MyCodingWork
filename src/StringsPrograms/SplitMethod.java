package StringsPrograms;
import java.util.Scanner;

public class SplitMethod {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        String[] s1 = str.split("@");

        for(int i=0; i<s1.length; i++)
            System.out.println(s1);

    }
}


