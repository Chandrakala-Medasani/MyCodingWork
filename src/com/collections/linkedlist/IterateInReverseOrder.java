package com.collections.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class IterateInReverseOrder {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        ListIterator<Object> lt = list.listIterator(list.size());
        while(lt.hasPrevious())
            System.out.println(lt.previous());

        for(int i= list.size()-1;i>=0;i--)
            System.out.println(list.get(i));
    }
}
