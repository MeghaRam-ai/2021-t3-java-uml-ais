package fr.epita.bankaccount.datamodel;

import java.math.BigDecimal;

public class StockOrder {
    private BigDecimal unitPrice;

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    @Override
    public String toString() {
        return "StockOrder{" +
                "unitPrice=" + unitPrice +
                ", commission=" + commission +
                ", quantity=" + quantity +
                '}';
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private BigDecimal commission;
    private int quantity;
}
