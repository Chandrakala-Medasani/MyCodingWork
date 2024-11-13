package SecondBatch;
import java.util.Scanner;

public class WordReverse {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        char[] ch = str.toCharArray();
        String rev="";

        for(int i=ch.length-1; i>=0; i--)
            rev+=ch[i];

        System.out.print(rev);
    }
}
