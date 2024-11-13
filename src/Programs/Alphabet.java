package Programs;
import java.util.*;

//if the first letter is capital letter print 1
//if the first letter is small letter print 0
//else print -1

public class Alphabet {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        char ch = scr.next().charAt(0);

        if(ch>='A'&&ch<='Z')
            System.out.println("1");
        else if(ch>='a'&&ch<='z')
            System.out.println("0");
        else
            System.out.println("-1");


    }
}
