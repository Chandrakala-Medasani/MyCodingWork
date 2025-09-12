package StringsPrograms;


import java.util.Scanner;

public class PrintUniqueLettersInTheString {

    public static int isFrequency(String str, char ch){

        int count = 0;
        for(int i=0; i<str.length(); i++)
            if(str.charAt(i) == ch)
                count++;

        return count;

    }

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        for(int i=0;i<str.length();i++) {
            if (isFrequency(str, str.charAt(i)) == 1)
                System.out.println(str.charAt(i));
        }

    }
}
