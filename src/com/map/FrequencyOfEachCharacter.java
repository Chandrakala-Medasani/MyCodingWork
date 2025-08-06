package com.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfEachCharacter {

    static int frequency(String name, char ch){
        int count=0;
        for(int i=0; i<name.length(); i++)
            if(name.charAt(i)==ch)
                count++;

        return count;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String name = scr.nextLine();

        Map<Character,Integer> map = new LinkedHashMap<>();

        for(int i=0; i<name.length(); i++)
            map.put(name.charAt(i),frequency(name,name.charAt(i)));

        for(Map.Entry<Character,Integer> m : map.entrySet())
            System.out.println(m);
    }
}
