package com.collections.arrayList;

import java.util.ArrayList;

public class InsertAtFirstPosition {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(12);
        al.add(24);
        al.add(36);
        al.add(0,48);

        for(Object temp : al)
            System.out.println(temp);
    }
}
