package com.variables;

public class Calculator {

    int a =50;
    int b =25;

    public static int add(int a, int b){
        return a+b;
    }

    public static int sub(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(add(c.a,c.b));
        System.out.println(sub(c.a,c.b));
    }
}
