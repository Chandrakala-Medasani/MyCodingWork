package com.java8.lambda;

import java.util.Scanner;

public class MathOperationsMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        MathOperations add = (a,b) -> a+b;
        MathOperations diff = (a,b) -> a-b;
        MathOperations prod = (a,b) -> a*b;
        MathOperations div = (a,b) -> a/b;
        MathOperations rem = (a,b) -> a%b;
        System.out.println(add.operation(x,y));
        System.out.println(diff.operation(x,y));
        System.out.println(prod.operation(x,y));
        if(y!=0) {
            System.out.println(div.operation(x, y));
            System.out.println(rem.operation(x, y));
        }
        else{
            System.out.println("Cannot divide by zero.");
            System.out.println("Cannot find remainder with zero.");
        }

    }
}
