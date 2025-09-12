package HackerRank;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);

        int size = scr.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++)
            arr[i] = scr.nextInt();

        int large = -99999;

        for(int i=0; i<size; i++)
            if(large<arr[i])
                large = arr[i];

        System.out.println(large);
    }
}
