package com.java8.lambda;

import java.util.Scanner;
import java.util.function.BiFunction;

public class MaximumBifunction {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int x = scr.nextInt();
        int y = scr.nextInt();

        BiFunction<Integer,Integer,Integer> max = (a,b) ->  (a>b)?a:b;
//            if(a>b)
//                return a;
//            else
//                return b;
      //  };

        System.out.println(max.apply(x,y));
    }
}
