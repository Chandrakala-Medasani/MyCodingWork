package Programs;
import java.util.*;
public class TextPalindrome {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        String rev = "";
        char ch[] = str.toCharArray();
        for(int i=str.length()-1; i>=0; i--)
            rev= rev + ch[i];
        if(str.equalsIgnoreCase(rev))
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");

    }
}