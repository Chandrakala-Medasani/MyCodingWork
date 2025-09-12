package StringsPrograms;
import java.util.Scanner;

public class IndexOfMethod {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        char ch = scr.next().charAt(0);

        System.out.print(str.indexOf(ch));
    }
}
