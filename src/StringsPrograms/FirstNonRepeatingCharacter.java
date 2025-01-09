package StringsPrograms;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String str = scr.next();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }

            if (count ==1) {
                System.out.print(str.charAt(i));
                break;
            }
        }
    }


}
