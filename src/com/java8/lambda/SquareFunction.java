package com.java8.lambda;

import java.util.Scanner;
import java.util.function.Function;

public class SquareFunction {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();

        Function<Integer,Integer> square = (n) -> n*n;

        System.out.println(square.apply(num));
    }
}
