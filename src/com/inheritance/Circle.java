package com.inheritance;

public class Circle extends Shape{

    @Override
    public void draw(){
        System.out.println("Drawing Circle");
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}
