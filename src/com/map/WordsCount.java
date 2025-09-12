package com.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordsCount {

    static public int count(String name, String target){
        int count = 0;
        String[] name1 = name.split(" ");
        for(int i=0; i<name1.length; i++)
            if(name1[i].equals(target))
                count++;

        return count;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        Map<String,Integer> map = new LinkedHashMap<>();

        String[] name = str.split(" ");
        for(int i=0; i<name.length; i++)
            map.put(name[i], count(str,name[i]));

        System.out.println(map);

    }
}
