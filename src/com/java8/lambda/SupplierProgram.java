package com.java8.lambda;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierProgram {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        Supplier<String> print = () ->  str;

        System.out.println(print.get());

    }
}
