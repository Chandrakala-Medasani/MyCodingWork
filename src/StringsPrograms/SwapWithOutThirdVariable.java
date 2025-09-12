package StringsPrograms;
import java.util.Scanner;

public class SwapWithOutThirdVariable {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String str1 = scr.next();
        String str2 = scr.next();

        str1 = str1+str2;
        str2 = str1.substring(0,str2.length());
        str1 = str1.substring(str1.length()-str2.length());

        System.out.println(str1);
        System.out.println(str2);
    }
}
