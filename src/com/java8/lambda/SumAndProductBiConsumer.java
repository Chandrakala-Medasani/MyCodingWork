package com.java8.lambda;



import java.util.Scanner;
import java.util.function.BiConsumer;

public class SumAndProductBiConsumer {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();

        BiConsumer<Integer, Integer> sp = (x,y) -> {
            System.out.println(x+y);
            System.out.println(x*y);
        };

        sp.accept(a,b);
    }
}
