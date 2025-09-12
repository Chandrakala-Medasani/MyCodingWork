package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int res = 0;
        try {
            int a = scr.nextInt();
            int b = scr.nextInt();
            res = a / b;
        }
        catch(InputMismatchException i){
            System.out.println("Please give only numbers");
            i.printStackTrace();
        }
        catch(ArithmeticException a){
            System.out.println("Number cannot be divided with 0");
            a.printStackTrace();
        }

        System.out.println(res);

    }
}
