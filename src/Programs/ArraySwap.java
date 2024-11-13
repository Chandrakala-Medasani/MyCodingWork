package Programs;
import java.util.Scanner;

//to swap an array without using third variable

public class ArraySwap {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++)
            arr[i]=scr.nextInt();

        for(int i=0; i<size/2; i++){
            arr[i] = arr[i]+arr[size-i-1];
            arr[size-i-1] = arr[i]-arr[size-i-1] ;
            arr[i] = arr[i]-arr[size-i-1];
        }
            //arr[i]=arr[size-i-1];

        for(int i=0; i<size; i++)
            System.out.print(arr[i]+" ");

    }
}
