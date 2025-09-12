package com.java8.lambda;

import java.util.Scanner;
import java.util.function.BiFunction;

public class AddingUsingBifunction {

    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> bi = (Integer a, Integer b) ->{
          return a+b;
        };
        Scanner scr = new Scanner(System.in);
        Integer a = scr.nextInt();
        Integer b = scr.nextInt();
        System.out.println(bi.apply(a,b));
    }
}
