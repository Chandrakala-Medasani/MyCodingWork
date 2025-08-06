package com.java8.lambda;

import java.util.Scanner;
import java.util.function.Consumer;

public class EvenOrOddUsingConsumer {

    public static void main(String[] args) {

        Consumer<Integer> c = (Integer num)->{

            if(num%2==0)
                System.out.println("Even Number");
            else
                System.out.println("Odd Number");
        };
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        c.accept(num);
    }
}
