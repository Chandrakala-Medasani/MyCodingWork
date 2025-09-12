package com.Abstraction;

public abstract class DigitalPayment implements Payment{

    String transactionId;

    @Override
    public String getPaymentDetails() {
        return "transactionId";
    }

}
