package com.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleOnMapMethods {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Blue");
        map.put(2,"Green");
        map.put(3,"Orange");

        for(Map.Entry<Integer,String> entry: map.entrySet())
            System.out.println(entry.getKey()+"  "+entry.getValue());

        System.out.println(map.entrySet());

    }
}
