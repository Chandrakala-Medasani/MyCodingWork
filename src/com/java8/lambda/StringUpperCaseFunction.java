package com.java8.lambda;

import java.util.Scanner;
import java.util.function.Function;

public class StringUpperCaseFunction {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        Function<String,String> ft = (st) -> st.toUpperCase()+"!!!";

        System.out.println(ft.apply(str));
    }
}
