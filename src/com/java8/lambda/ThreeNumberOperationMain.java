package com.java8.lambda;

import java.util.Scanner;

public class ThreeNumberOperationMain {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();

        ThreeNumberOperation average = (x,y,z) -> (x+y+z)/3;

        System.out.println(average.calculate(a,b,c));
    }
}
