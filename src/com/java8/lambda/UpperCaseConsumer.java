package com.java8.lambda;

import java.util.Scanner;
import java.util.function.Consumer;

public class UpperCaseConsumer {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String str= scr.nextLine();

        Consumer<String> upper = (st) -> System.out.println(st.toUpperCase());

        upper.accept(str);
    }
}
