package com.java8.lambda;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class AddingUsingBiconsumer {

    public static void main(String[] args) {

        BiConsumer<Integer,Integer> b = (Integer n1, Integer n2) -> {
            System.out.println(n1+n2);
        };

        Scanner scr = new Scanner(System.in);
        int n1 = scr.nextInt();
        int n2 = scr.nextInt();
        b.accept(n1,n2);

    }
}
