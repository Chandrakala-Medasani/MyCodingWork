package com.Abstraction;

import java.util.Scanner;

public class PaymentProcessingSystem {

    public static void main(String[] args) {
        DigitalPayment cc = new CreditCardPayment();
        DigitalPayment cc1 = new UpiPayment();
        Scanner scr = new Scanner(System.in);
        double amount = scr.nextDouble();
        int choice = scr.nextInt();
        switch(choice){
            case 1:int cardNumber = scr.nextInt();
            scr.nextLine();
            String cardHolderName = scr.nextLine();
            cc.pay(amount);
            break;

            case 2:
                String upiId = scr.nextLine();
                cc1.pay(amount);
                break;
        }
    }
}
