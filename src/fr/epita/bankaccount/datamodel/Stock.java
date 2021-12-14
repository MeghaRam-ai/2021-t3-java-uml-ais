package fr.epita.bankaccount.datamodel;

import java.math.BigDecimal;

public class Stock {
    private BigDecimal currentPrice;

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "currentPrice=" + currentPrice +
                '}';
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }
}
