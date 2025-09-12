package Exceptions;

public class NumberFormatExceptionsProgram {

    public static void main(String[] args){

        String str ="chandu";

        try {
            System.out.println(Integer.parseInt(str));
        }

        catch(NumberFormatException nf){

            System.out.println("Program executed");
        }


    }
}
