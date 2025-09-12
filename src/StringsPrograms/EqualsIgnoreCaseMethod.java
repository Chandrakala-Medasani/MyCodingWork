package StringsPrograms;
import java.util.Scanner;

public class EqualsIgnoreCaseMethod {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String str1 = scr.nextLine();
        String str2 = scr.nextLine();

        System.out.println(str1.equalsIgnoreCase(str2));

    }
}
