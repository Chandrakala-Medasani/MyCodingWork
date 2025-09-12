package com.Abstraction;

import java.util.Scanner;

public class Circle extends Shape{

    @Override
    public double getArea() {
        Scanner scr = new Scanner(System.in);
        int radius = scr.nextInt();
        return 3.14*radius*radius;
    }
}
