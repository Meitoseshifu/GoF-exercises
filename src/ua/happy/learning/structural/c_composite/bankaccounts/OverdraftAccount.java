package ua.happy.learning.structural.c_composite.bankaccounts;

import java.math.BigInteger;

public class OverdraftAccount extends BasicAccount {

    private final Integer INTEREST = 1;

    public OverdraftAccount(String accountNo, BigInteger accountBalance) {
        super(accountNo, accountBalance);
    }

    @Override
    public BigInteger calculateInterest() {
        return null;
    }
}
