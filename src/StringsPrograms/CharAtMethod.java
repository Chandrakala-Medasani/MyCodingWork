package StringsPrograms;
import java.util.Scanner;

public class CharAtMethod {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        int index = scr.nextInt();

        System.out.println(str.charAt(index));
    }
}

