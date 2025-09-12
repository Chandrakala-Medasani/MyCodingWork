package com.collections.arrayList;

public class ImplementingChanduArrayList {

    public static void main(String[] args) {

        ChanduArrayList cl = new ChanduArrayList();

        cl.add(80);
        cl.add(45);
        cl.add(97);
        cl.printValues();
        cl.add(1,55);
        cl.printValues();
        cl.delete();
        cl.printValues();
        cl.add(80);
        cl.add(45);
        cl.add(97);
        cl.add(80);
        cl.add(45);
        cl.add(97);
        cl.add(80);
        cl.add(45);
        cl.add(97);
        System.out.println(cl.get(4));
        cl.printValues();
        System.out.println(cl.size());

    }
}
