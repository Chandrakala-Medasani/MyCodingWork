package CollectionsPrograms;

import java.util.Scanner;

public class Positive_Negative_Zero {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scr.nextInt();

        if(a>0){
            System.out.println("Positive number");
        }

        else if(a<0){
            System.out.println("Negative number");
        }

        else{
            System.out.println("Zero");
        }


    }
}
