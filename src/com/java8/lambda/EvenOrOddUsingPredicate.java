package com.java8.lambda;

import java.util.Scanner;
import java.util.function.Predicate;

public class EvenOrOddUsingPredicate {

    public static void main(String[] args) {

        Predicate<Integer> p = (Integer n) -> {
            if(n%2==0){
                return true;
            }
            else {
                return false;
            }
        };
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        System.out.println(p.test(num));
    }
}
