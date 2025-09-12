package HackerRank;

import java.util.Scanner;

public class SwapWithOutThirdVarible {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a+"\t"+b);
    }
}
