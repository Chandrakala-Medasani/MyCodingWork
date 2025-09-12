package com.Abstraction;

import java.util.Scanner;

public class Rectangle extends Shape{

    @Override
    public double getArea() {
        Scanner scr = new Scanner(System.in);
        int l = scr.nextInt();
        int b = scr.nextInt();
        return l*b;
    }
}
