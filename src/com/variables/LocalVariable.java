package com.variables;

public class LocalVariable {

    public void display(){
        int a = 200;
        System.out.println(a);
    }

    public static void main(String[] args) {
        LocalVariable l = new LocalVariable();
        l.display();
    }
}
