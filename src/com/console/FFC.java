package com.console;

import java.util.Scanner;

public class FFC {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int total = 0;
        int bill = 0;
        int quantity;
        int select;
        System.out.println("Welcome to FFC");

        do{
            System.out.println("Menu");
            System.out.println("1. Burgers (₹99) ");
            System.out.println("2. Wings (₹120) ");
            System.out.println("3. Fries (₹60) ");
            System.out.println("4. Exit ");
            System.out.println("Select the menu");
            select = scr.nextInt();
            switch(select){
                case 1 :
                    System.out.println("Enter the quantity : ");
                    quantity = scr.nextInt();
                    System.out.println(quantity+" burgers added to cart");
                    total = total+(quantity*99);
                    break;
                case 2 :
                    System.out.println("Enter the quantity : ");
                    quantity = scr.nextInt();
                    System.out.println(quantity+" Wings added to cart");
                    total = total+(quantity*120);
                    break;
                case 3 :
                    System.out.println("Enter the quantity : ");
                    quantity = scr.nextInt();
                    System.out.println(quantity+" Fries added to cart");
                    total = total+(quantity*60);
                    break;
                case 4 :
                    break;
                default :
                    System.out.println("Please choose in first 3 options only");
                    break;
            }
        }while(select!=4);

        System.out.println("Total price = "+total);
    }
}
