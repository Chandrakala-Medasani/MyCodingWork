package com.encapsulation;

import java.util.Scanner;

public class EmailValidationMainMethod {

    public static void main(String[] args) {

        EmailValidation ev = new EmailValidation();
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        ev.setEmail(str);
        System.out.println(ev.getEmail());
    }
}
