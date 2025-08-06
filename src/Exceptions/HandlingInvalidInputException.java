package Exceptions;

import java.util.Scanner;

public class HandlingInvalidInputException {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();

            try{
                if(num<0)
                    throw new InvalidInputException("Negative numbers are not accepted");
            }
        catch(InvalidInputException i){
            System.out.println(i.getMessage());
        }

    }
}
