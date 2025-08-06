package com.collections.arrayList;


import java.util.LinkedList;
import java.util.List;

public class PrintOnlyEvenNumbers {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(45);
        list.add(22);
        list.add(56);
        list.add(55);

        for(int i=0;i<list.size();i++)
            if(list.get(i)%2 != 0)
                list.remove(i);
        System.out.println(list);
    }
}
