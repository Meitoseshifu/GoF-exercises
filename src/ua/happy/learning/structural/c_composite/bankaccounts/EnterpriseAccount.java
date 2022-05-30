package ua.happy.learning.structural.c_composite.bankaccounts;

import java.math.BigInteger;

public class EnterpriseAccount extends BasicAccount {

    private final Integer INTEREST = 7;

    public EnterpriseAccount(String accountNo, BigInteger accountBalance) {
        super(accountNo, accountBalance);
    }

    @Override
    public BigInteger calculateInterest() {
        return null;
    }
}
