package StringsPrograms;
import java.util.Scanner;


public class ToLowerCaseMethod {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        System.out.println(str.toLowerCase());

        String str1 = str.toLowerCase();
        System.out.println(str1);
    }
}
