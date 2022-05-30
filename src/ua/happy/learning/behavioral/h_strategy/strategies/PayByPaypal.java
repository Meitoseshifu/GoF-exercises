package ua.happy.learning.behavioral.h_strategy.strategies;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByPaypal implements PayStrategy {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    @Override
    public void collectPaymentDetails() {

    }

    @Override
    public boolean pay(int paymentAmount) {
        return false;
    }

}
