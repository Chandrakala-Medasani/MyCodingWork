package com.collections.linkedlist;

import java.util.LinkedList;

public class InsertAtFirstAndLast {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(150);
        list.add(100);
        list.add(0,200);
        list.add(3,50);

        for(Integer temp : list)
            System.out.println(temp);
    }
}
