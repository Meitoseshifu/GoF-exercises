package ua.happy.learning.behavioral.h_strategy.strategies;

public interface PayStrategy {

    boolean pay(int paymentAmount);
    void collectPaymentDetails();

}
