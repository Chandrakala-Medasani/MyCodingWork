package Exceptions;

public class StringIndexOutOfBoundExceptionsProgram {

    public static void main(String[] args){

        String str = "chandu";

        try {
            System.out.println(str.charAt(7));
        }

        catch(StringIndexOutOfBoundsException si){
            System.out.println("Program executed!!!");
        }


    }
}
