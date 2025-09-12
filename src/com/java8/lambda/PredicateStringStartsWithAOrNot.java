package com.java8.lambda;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateStringStartsWithAOrNot {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        Predicate<String> ps = (st) -> !st.isEmpty()&&st.charAt(0)=='A';

        System.out.println(ps.test(str));
    }
}
