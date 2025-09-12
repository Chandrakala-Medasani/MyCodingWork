package Exceptions;

import java.util.Scanner;

public class AgeValidationException {

    public static void validateAge(int age) throws IllegalArgumentException{


            if(age<18)
                throw new IllegalArgumentException("Minor!! Not eligible to vote");

            else
                System.out.println("Vote for a better nation");

    }

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int age = scr.nextInt();

        try {
            validateAge(age);
        }
        catch (IllegalArgumentException ia){
            System.out.println(ia.getMessage());
        }

    }
}
