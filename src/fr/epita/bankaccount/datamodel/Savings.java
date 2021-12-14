package fr.epita.bankaccount.datamodel;

import java.math.BigDecimal;

public class Savings extends Account{
    private BigDecimal interestRate;

    @Override
    public String toString() {
        return "Savings{" +
                "interestRate=" + interestRate +
                '}';
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }
}
