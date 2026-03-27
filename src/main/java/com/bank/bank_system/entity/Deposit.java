package com.bank.bank_system.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="deposit")
public class Deposit {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="ID")
private int id;
@Column(name="ACCOUNT_NO")
private String accountNo;
@Column(name="AMOUNT")
private double amount;
@Column(name="INTEREST_RATE")
private double interestRate;
@Column(name="START_DATE")
private LocalDate startDate;
@Column(name="BALANCE")
private double balance;

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

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
