package com.collections.arrayList;

import java.util.ArrayList;

public class RetrieveAnElement {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("Ram");
        al.add("Tarak");
        al.add("Abhay");
        al.add("Bhargav");
        al.add("Pranathi");

        System.out.println(al.get(2));
    }
}
