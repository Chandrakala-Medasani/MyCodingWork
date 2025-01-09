package StringsPrograms;
import java.util.Scanner;

public class FrequencyOfACharacter {

    public static int isFrequency(String str, char ch){

        int count = 0;
        for(int i=0; i<str.length(); i++)
            if(str.charAt(i) == ch)
                count++;

        return count;

    }

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        char ch = scr.next().charAt(0);

        int res = isFrequency(str,ch);

        System.out.println(res);
    }
}
