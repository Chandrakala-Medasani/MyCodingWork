package com.java8.lambda;

import java.util.Scanner;
import java.util.function.BiFunction;

public class MathOperationsMain2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        BiFunction<Integer, Integer, Integer> add = (a,b) -> a+b;
        BiFunction<Integer, Integer, Integer> diff = (a,b) -> a-b;
        BiFunction<Integer, Integer, Integer> prod = (a,b) -> a*b;
        BiFunction<Integer, Integer, Integer> div = (a,b) -> a/b;
        BiFunction<Integer, Integer, Integer> rem = (a,b) -> a%b;

        System.out.println(add.apply(x,y));
        System.out.println(diff.apply(x,y));
        System.out.println(prod.apply(x,y));
        System.out.println(div.apply(x,y));
        System.out.println(rem.apply(x,y));


    }
}
