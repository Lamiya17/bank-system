package com.bank.bank_system.dto;

import jakarta.validation.constraints.Positive;

public class CreditDTO {
    private String accountNo;
    @Positive(message = "Total debt must be positive")
    private double totalDebt;
    @Positive(message = "Interest rate must be positive")
    private double interestRate;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getTotalDebt() {
        return totalDebt;
    }

    public void setTotalDebt(double totalDebt) {
        this.totalDebt = totalDebt;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
