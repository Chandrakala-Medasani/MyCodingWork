package com.java8.lambda;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateProgram {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        Predicate<Integer> even = (x) ->  x%2==0;

        System.out.println(even.test(n));

    }
}
