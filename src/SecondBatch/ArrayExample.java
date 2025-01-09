package SecondBatch;
import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();

        int[] arr = new int[size];

        for(int i=0; i<size; i++)
            arr[i] = scr.nextInt();
    }
}
