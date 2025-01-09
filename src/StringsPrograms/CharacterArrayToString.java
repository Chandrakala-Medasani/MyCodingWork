package StringsPrograms;
import java.util.Scanner;

public class CharacterArrayToString {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        char[] ch = new char[size];

        for(int i=0; i<size; i++)
            ch[i]=scr.next().charAt(i);

        String str="";

        for(int i=0; i<size; i++)
            str = str+ch[i];

        System.out.println(str);

    }
}
