package com.java8.lambda;

import java.util.Scanner;

public class StringReverserImplementing {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        StringReverser sr = (st) -> {
            String rev="";
            for(int i=st.length()-1; i>=0; i--)
                rev=rev+st.charAt(i);

            return rev;
        };

        System.out.println(sr.reverse(str));

    }
}
