package Programs;

import java.util.Scanner;

public class ExampleMethod1 {
    public static void main(String[] args){
        ExampleMethod em = new ExampleMethod();
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        System.out.println(em.add(a,b));
    }
}
