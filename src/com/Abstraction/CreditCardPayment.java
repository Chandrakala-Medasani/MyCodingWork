package com.Abstraction;

public class CreditCardPayment extends DigitalPayment{

   public int cardNumber;
   public String cardHolderName;

    @Override
    public void pay(double amount) {
        System.out.println("Paid "+amount+" using credit card "+cardNumber);
    }
}
