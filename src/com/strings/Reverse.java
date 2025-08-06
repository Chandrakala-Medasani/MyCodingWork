package com.strings;

import java.util.Scanner;

//Nacre
//ercaN

public class Reverse {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String str = scr.next();
        System.out.println(isReverse(str));
    }

    public static String isReverse(String str){

        String rev="";
        for(int i=str.length()-1; i>=0; i--)
            rev=rev+str.charAt(i);

        return rev;
    }
}
