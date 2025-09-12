package StringsPrograms;
import java.util.Scanner;

public class PangramOrNot {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        str = str.toLowerCase();

        boolean flag = false;

        for(char ch = 'a'; ch<='z'; ch++)
            if(str.indexOf(ch)==-1){
                flag = true;
                break;
            }

        if(flag == false)
            System.out.print("Pangram");
        else
            System.out.print("Not a pangram");

    }
}
