package com.inheritance;

public class Derived extends Base{
    @Override
    public void display(){
        num++;
        super.display();
    }

    public static void main(String[] args) {
        Derived d = new Derived();
        d.display();
    }
}
