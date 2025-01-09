package StringsPrograms;
import java.util.Scanner;

public class StartsWithMethod {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        String str1 = scr.nextLine();

        System.out.println(str.startsWith(str1));
    }
}
