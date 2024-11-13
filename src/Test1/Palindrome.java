package Test1;
import java.util.*;

public class Palindrome {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        String str1 ="";
        char[] ch=str.toCharArray();
        for(int i=str.length()-1; i>=0; i--)
            str1+=ch[i];
        if(str.equals(str1))
            System.out.println("It is palindrome");
        else
            System.out.println("It is not palindrome");
    }
}
