package StringsPrograms;
import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        String rev="";

       // char[] ch = str.toCharArray();

        for(int i=str.length()-1; i>=0; i--)
            rev = rev + str.charAt(i);

           // rev = rev + ch[i];

        System.out.println(rev);
    }
}
