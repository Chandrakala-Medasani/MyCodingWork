package Test1;
import java.util.*;
public class Reverse {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        char[] ch = str.toCharArray();
        for(int i=str.length()-1; i>=0; i--)
            System.out.print(ch[i]);

    }
}
