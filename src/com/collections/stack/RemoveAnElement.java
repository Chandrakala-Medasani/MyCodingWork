package com.collections.stack;

import java.util.Stack;

public class RemoveAnElement {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("Blue");
        s.push("pink");
        s.push("yellow");
        s.push("orange");

        String s1 = s.pop();
        System.out.println(s1);

        System.out.println(s);
    }
}
