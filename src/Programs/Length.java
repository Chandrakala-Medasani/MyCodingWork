package Programs;
import java.util.*;

public class Length {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        String s = scr.nextLine();
        int len =0;
        for(char s1 : s.toCharArray())
            len++;
        System.out.println(len);
    }
}
