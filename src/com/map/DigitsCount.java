package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DigitsCount {
    static int count(int num, int target){
        int c =0;
        while(num>0){
            if(num%10==target)
                c++;
            num/=10;
        }
        return c;
    }
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int temp=num;

        Map<Integer,Integer> map = new HashMap<>();

        while(num>0){
            map.put(num%10,count(temp,num%10));
            num/=10;
        }

        System.out.println(map);
    }
}
