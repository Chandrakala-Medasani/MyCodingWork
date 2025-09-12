package com.Abstraction;

public class UpiPayment extends DigitalPayment{

    String upiId;

    @Override
    public void pay(double amount) {
        System.out.println("Paid "+amount+" via UPI "+upiId);
    }
}
