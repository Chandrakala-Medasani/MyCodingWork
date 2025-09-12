package Exceptions;

import java.util.Scanner;

public class AgeSolution {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int age = scr.nextInt();

        AgeValidation av = new AgeValidation();
        try{
            av.getValidate(age);
        }
        catch(InvalidAgeException i){
            System.out.print(i.getMsg());
        }
    }
}
