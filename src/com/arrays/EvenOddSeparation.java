package com.arrays;

import java.util.Scanner;

public class EvenOddSeparation {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scr.nextInt();

        int arr1[] = new int[n];
        int j=0;

        for(int i=0; i<n; i++)
            if(arr[i]%2==0) {
                arr1[j] = arr[i];
                j++;
            }
        for(int i=0;i<n;i++)
            if(arr[i]%2!=0){
                arr1[j] = arr[i];
                j++;
            }

        for(int i=0; i<n; i++)
            System.out.print(arr1[i]+" ");
    }
}
