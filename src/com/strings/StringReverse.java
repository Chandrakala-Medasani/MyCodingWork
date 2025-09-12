package com.strings;

import java.util.Scanner;

//Chandu
//udnahC

public class StringReverse {

    public static String isReverse(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str = scr.next();
        System.out.println(isReverse(str));

    }
}
