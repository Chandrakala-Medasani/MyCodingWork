package com.strings;

import java.util.Scanner;

public class RemoveDuplicates {

    public static String removeDuplicates(String str){
        String str1="";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(str1.indexOf(ch)==-1)
                str1+=ch;
        }
        return str1;
    }


    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        System.out.println(removeDuplicates(str));
    }
}
