package Programs;

import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);

        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();

        if(a>b && a>c)
            System.out.println("a is largest");
        else if(b>a && b>c)
            System.out.println("b is largest");
       else
            System.out.println("c is largest");




      /*  int num = scr.nextInt();

        if(num%2==0){
            System.out.println("Even");
        }

        else{
            System.out.println("Odd");
        }*/
       /* int a = 5;
        int b = 10;

        int sum = 0;

        if(a>b){
            sum = a+b;
        }

        System.out.println(sum);*/
    }
}
