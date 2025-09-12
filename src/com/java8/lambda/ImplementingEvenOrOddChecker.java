package com.java8.lambda;

import java.util.Scanner;

public class ImplementingEvenOrOddChecker {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();

        EvenOrOddChecker ec = (n) -> {
            if(n%2==0)
                return "Even";
            else
                return "Odd";
        };

        System.out.println(ec.evenOrOdd(num));
    }
}
