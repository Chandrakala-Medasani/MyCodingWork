package com.java8.lambda;

public class GreetingMain {

    public static void main(String[] args) {
        Greeting greet = () -> System.out.println("Hii, Java 8!!");
        greet.message();
    }
}
