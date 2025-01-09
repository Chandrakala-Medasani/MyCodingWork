package StringsPrograms;
import java.util.Scanner;

public class PalindromeOrNot {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        String rev="";

        for(int i=str.length()-1; i>=0; i--)
            rev = rev+str.charAt(i);

        if(str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
