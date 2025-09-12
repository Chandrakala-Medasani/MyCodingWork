package HackerRank;

import java.util.Scanner;

public class FrequencyOfEachCharacter {

    public static void isFrequency(String str, char ch){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==ch && (ch>='a'&&ch<='z'))
                count++;
        }
        if(count>0)
            System.out.println(ch+" - "+count);
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        char[] ch = str.toCharArray();

        for(int i=0; i<ch.length; i++)
            isFrequency(str, ch[i]);
    }
}
