package com.strings;

import java.util.Scanner;

public class LastNonRepeatingCharacter {

    public static char lastNonRepeat(String str){
        char ch1 ='\0';
        str=str.toLowerCase();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int count = 0;
            for(int j=0; j<str.length(); j++){
                if(ch==str.charAt(j))
                    count++;
            }
            if(count==1)
                ch1=ch;
        }
        return ch1;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        System.out.println(lastNonRepeat(str));
    }
}
