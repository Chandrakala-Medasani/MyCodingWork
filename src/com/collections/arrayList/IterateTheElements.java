package com.collections.arrayList;

import java.util.ArrayList;

public class IterateTheElements {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add("Chandu");
        al.add("Madhu");

        for(Object temp : al)
            System.out.println(temp);
    }
}
