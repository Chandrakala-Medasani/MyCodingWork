package com.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++)
            arr[i] = scr.nextInt();

        int target = scr.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++)
                if(arr[i]+arr[j]==target) {
                    list.add(i);
                    list.add(j);
                    break;
                }
        }
        System.out.println(list);
    }
}
