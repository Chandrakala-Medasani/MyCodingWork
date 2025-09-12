package com.encapsulation;

import java.util.Scanner;

public class UserMain {

    public static void main(String[] args) {
        User u = new User();
        Scanner scr = new Scanner(System.in);
        int age = scr.nextInt();
        scr.nextLine();
        String name = scr.nextLine();

        u.setAge(age);
        u.setName(name);
        System.out.println(u.getAge());
        System.out.println(u.getName());
    }
}
