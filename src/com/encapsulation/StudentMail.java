package com.encapsulation;

import java.util.Scanner;

public class StudentMail {
    public static void main(String[] args) {
        Student st = new Student();
        Scanner scr = new Scanner(System.in);
        int age = scr.nextInt();
        String name = scr.nextLine();
        String email = scr.nextLine();

        st.setAge(age);
        st.setName(name);
        st.setEmail(email);

        System.out.println(st.getAge());
        System.out.println(st.getEmail());
        System.out.println(st.getName());

    }
}
