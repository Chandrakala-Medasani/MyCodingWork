package com.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortStrings {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        List<String> ls = new ArrayList<>();
        int size = scr.nextInt();
        for(int i=0; i<size; i++)
            ls.add(scr.next());

        ls.sort((s1,s2) -> s1.compareTo(s2));

        for(String str : ls)
            System.out.println(str);
    }
}
