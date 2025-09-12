package HackerRank;

import java.util.Scanner;

public class ArrayIsSortedOrNot {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++)
            arr[i]=scr.nextInt();

        for(int i=0; i<size-1; i++)
            if(arr[i]>arr[i+1]) {
                System.out.println("false");
                break;
            }

        System.out.println("true");

    }
}
