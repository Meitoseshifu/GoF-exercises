package ua.happy.learning.behavioral.h_strategy.strategies;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    @Override
    public void collectPaymentDetails() {

    }

    @Override
    public boolean pay(int paymentAmount) {
        return false;
    }
}
