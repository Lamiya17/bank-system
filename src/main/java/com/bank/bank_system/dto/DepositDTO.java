package com.bank.bank_system.dto;

import jakarta.validation.constraints.Positive;

public class DepositDTO {
    private String accountNo;
    @Positive(message="Amount must be positive")
    private double amount;
    @Positive(message = "interest must be positive")
    private double interest;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
