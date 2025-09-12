package com.java8.lambda;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerProgram {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        Consumer<String> message = (st) -> System.out.println(st);

        message.accept(str);
    }
}
