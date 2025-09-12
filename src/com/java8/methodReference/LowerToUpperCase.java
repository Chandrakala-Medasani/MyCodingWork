package com.java8.methodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class LowerToUpperCase {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        scr.nextLine();
        List<String> ls = new ArrayList<>();

        for(int i=0; i<size; i++)
            ls.add(scr.nextLine());



    }
}
