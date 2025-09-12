package Exceptions;

import java.util.Scanner;

public class LuggageSolution {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int luggage = scr.nextInt();

        LuggageValidation l = new LuggageValidation();

        try{
            l.getValidate(luggage);
        }
        catch(InvalidLuggageException e){
            System.out.println(e.getMsg());
        }
    }
}
