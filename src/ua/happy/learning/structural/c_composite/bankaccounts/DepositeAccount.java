package ua.happy.learning.structural.c_composite.bankaccounts;

import java.math.BigInteger;

public class DepositeAccount extends BasicAccount {

    private final Long INTEREST = 5L;

    public DepositeAccount(String accountNo, BigInteger accountBalance) {
        super(accountNo, accountBalance);
    }

    @Override
    public BigInteger calculateInterest() {
        return null;
    }


}
