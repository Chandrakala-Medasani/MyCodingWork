package com.collections.linkedlist;

import java.util.LinkedList;

public class InsertAtSpecificPosition {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Ram");
//        list.add(1,"Siri");
//        list.add(2,"Lucky");
        list.addFirst("Siri");
        list.addLast("Lucky");

//        for(String temp : list )
//            System.out.println(temp);

        System.out.println(list);
    }
}
