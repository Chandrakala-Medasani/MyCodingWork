package com.java8.lambda;

import java.util.Scanner;
import java.util.function.Function;

public class EvenOrOddUsingFunction {

    public static void main(String[] args) {

        Function<Integer, String> f = (Integer num) ->{
            if(num%2==0) {
                return "Even";
            }
            else{
                return "Odd";
            }
        };
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        System.out.println(f.apply(num));
    }
}
