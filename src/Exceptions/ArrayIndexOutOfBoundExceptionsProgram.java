package Exceptions;

public class ArrayIndexOutOfBoundExceptionsProgram {

    public static void main(String[] srgs){

        int[] arr = {9,8,7,6};

        try {

            System.out.println(arr[5]);
        }

        catch(ArrayIndexOutOfBoundsException ai){

            System.out.println("Program executed!!!!");
        }
    }
}
