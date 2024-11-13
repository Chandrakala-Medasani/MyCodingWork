package SecondBatch;
import java.util.*;

public class TextReverse {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        String rev="";
        char[] ch = str.toCharArray();
        for(int i=str.length()-1; i>=0; i--)
            rev = rev+ch[i];
        System.out.println(rev);
    }
}
