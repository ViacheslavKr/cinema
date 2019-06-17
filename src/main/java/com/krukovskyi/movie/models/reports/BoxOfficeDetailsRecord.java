package com.krukovskyi.movie.models.reports;

import java.math.BigDecimal;

public class BoxOfficeDetailsRecord {
    private String showingType;
    private BigDecimal box;
    private BigDecimal amount;

    public BoxOfficeDetailsRecord(String showingType, BigDecimal box, BigDecimal amount) {
        this.showingType = showingType;
        this.box = box;
        this.amount = amount;
    }

    public String getShowingType() {
        return showingType;
    }

    public void setShowingType(String showingType) {
        this.showingType = showingType;
    }

    public BigDecimal getBox() {
        return box;
    }

    public void setBox(BigDecimal box) {
        this.box = box;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
