package StringsPrograms;
import java.util.Scanner;

public class AnagramOrNot {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String s1 = scr.nextLine();
        String s2 = scr.nextLine();

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        int count = 0;

        if(ch1.length == ch2.length) {

            for (int i = 0; i < ch1.length; i++) {
                for (int j = 0; j < ch2.length; j++)
                    if (ch1[i] == ch2[j])
                        count++;
            }
        }
        if(count == ch1.length)
            System.out.print("Anagram");
        else
            System.out.println("Not an anagram");
    }
}
