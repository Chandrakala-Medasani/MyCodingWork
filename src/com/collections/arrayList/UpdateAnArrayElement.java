package com.collections.arrayList;

import java.util.ArrayList;

public class UpdateAnArrayElement {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("Apple");
        al.add("Banana");
        al.add("Mango");
        al.add("Strawberry");

        al.set(2, "Pine apple");

        for(Object temp : al)
            System.out.println(temp);
    }
}
