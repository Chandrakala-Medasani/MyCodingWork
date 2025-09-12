package com.inheritance;

public class Dog extends Mammal{
    @Override
    public void whoAmI(){
        System.out.println("I'm an Dpg");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.whoAmI();
    }
}
