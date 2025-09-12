package Programs;

import java.util.Scanner;

public class Anagram {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);

        String str1 = scr.nextLine();
        String str2 = scr.nextLine();

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str1.toCharArray();

        int count = 0;

        if(ch1.length == ch2.length) {
            for (int i = 0; i < ch1.length; i++) {
                for (int j = 0; j < ch2.length; j++) {
                    if (ch1[i] == ch2[j])
                        count++;
                }
            }
        }
        if(count==ch1.length)
            System.out.println("It is anagram");
        else
            System.out.println("It is not anagram");
    }
}
