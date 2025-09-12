package com.java8.lambda;

import java.util.Random;
import java.util.function.Supplier;

public class RandomSupplier {

    public static void main(String[] args) {

        Supplier<Integer> random = () -> {
            Random rand = new Random();
            return rand.nextInt(100)+1;

        };

        System.out.println(random.get());
    }
}
