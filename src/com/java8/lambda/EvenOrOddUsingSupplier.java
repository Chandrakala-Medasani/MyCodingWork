package com.java8.lambda;

import java.util.Scanner;
import java.util.function.Supplier;

public class EvenOrOddUsingSupplier {

    public static void main(String[] args) {

        Supplier<String> s = () ->{
            Scanner scr = new Scanner(System.in);
            int num = scr.nextInt();
            if(num%2==0){
                return "Even";
            }
            else{
                return "Odd";
            }
        };
        System.out.println(s.get());
    }
}
