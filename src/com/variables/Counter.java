package com.variables;

public class Counter {

    static int count;

    Counter(){
        count++;
    }

    public static int display(){
        return count;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(display());

    }

}
