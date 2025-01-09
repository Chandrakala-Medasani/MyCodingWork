package Exceptions;

public class NullPointerExceptionsProgram {

    public static void main(String[] args){

        String str = null;

        try {
            System.out.println(str.toLowerCase());
        }

        catch(NullPointerException np){
            System.out.println("Please provide a value");
        }

        System.out.println("Program executed");
    }
}
