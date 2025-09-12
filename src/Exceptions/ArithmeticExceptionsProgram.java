package Exceptions;

public class ArithmeticExceptionsProgram {

    public static void main(String[] args){

        int n1 = 10;
        int n2 = 0;

        try{
            int res = n1/n2;
        }

        catch(ArithmeticException ae){

            System.out.println("Denominator cannot ne zero");
        }

        System.out.println("Program executed");
    }
}
