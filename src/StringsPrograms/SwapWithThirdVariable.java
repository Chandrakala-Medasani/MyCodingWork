package StringsPrograms;
import java.util.Scanner;

public class SwapWithThirdVariable {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String str1 = scr.next();
        String str2 = scr.next();

        String temp="";

        temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println(str1);
        System.out.println(str2);
    }
}
