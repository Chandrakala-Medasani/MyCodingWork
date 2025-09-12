package com.java8.lambda;

import java.util.Scanner;
import java.util.function.Function;

public class CountCharactersFunction {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        Function<String,Integer> count = (st) -> {
            return st.length();
        };

        System.out.println(count.apply(str));
    }
}
