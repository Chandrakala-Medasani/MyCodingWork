package StringsPrograms;
import java.util.Scanner;

public class ToCharArrayMethod {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        char[] ch = str.toCharArray();

        for(int i=0; i<ch.length; i++)
            System.out.println(ch[i]+" ");
    }
}
