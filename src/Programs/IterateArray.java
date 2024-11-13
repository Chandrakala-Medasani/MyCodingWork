package Programs;
import java.util.Scanner;

public class IterateArray {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();

        int[] a = new int[size];

        for(int i=0; i<size; i++)
            a[i] = scr.nextInt();

        for(int i=0; i<size; i++)
            System.out.print(a[i]+" ");
    }
}
