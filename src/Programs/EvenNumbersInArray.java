package Programs;
import java.util.Scanner;

public class EvenNumbersInArray {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();

        int[] arr = new int[size];

        for(int i=0; i<size; i++)
            arr[i] = scr.nextInt();

        for(int i=0; i<size; i++)
            if(arr[i]%2 == 0)
                System.out.print(arr[i]+" ");

    }
}
