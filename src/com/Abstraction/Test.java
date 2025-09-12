package com.Abstraction;

public class Test {

    public static void main(String[] args) {

        Shape s = new Circle();
        Shape ss = new Rectangle();
        System.out.println(s.getArea());
        System.out.println(ss.getArea());

    }
}
