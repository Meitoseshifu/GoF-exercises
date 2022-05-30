package ua.happy.learning.structural.c_composite.bankaccounts;

import java.math.BigInteger;

public class SavingAccount extends BasicAccount {

    private final Integer INTEREST = 15;

    public SavingAccount(String accountNo, BigInteger accountBalance) {
        super(accountNo, accountBalance);
    }

    @Override
    public BigInteger calculateInterest() {
        return null;
    }
}
