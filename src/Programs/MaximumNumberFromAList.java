package Programs;

import java.util.Scanner;

//WAP to find the maximum number from a list of integers

public class MaximumNumberFromAList {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();

        int[] arr = new int[size];

        for(int i=0; i<size; i++)
            arr[i] = scr.nextInt();

        int max = -99999;

        for(int i=0; i<size; i++)
            if(max<arr[i])
                max = arr[i];

        System.out.println(max);
    }
}

/*
Result:-
5
9
5
1
55
89
89
 */