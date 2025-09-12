package com.collections.arrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class AddElements {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        //Adding the elements
        al.add("Blue");
        al.add("Purple");
        al.add("Orange");
        al.add("Green");
        al.add("Yellow");

        // Traversing through for each
//        for(String temp : al)
//            System.out.println(temp);

        //Traversing through for loop
//        for(int i=0; i<al.size(); i++)
//            System.out.println(al.get(i));

        //Traversing through Iterator
//        Iterator i = al.iterator();
//        while(i.hasNext())
//            System.out.println(i.next());

        //Traversing through List Iterator
        ListIterator<String> li = al.listIterator(al.size());
        while(li.hasPrevious())
            System.out.println(li.previous());
    }
}