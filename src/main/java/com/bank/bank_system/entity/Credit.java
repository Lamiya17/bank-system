package com.bank.bank_system.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="credit")
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="ACCOUNT_NO")
    private String accountNo;
    @Column(name="TOTAL_DEBT")
    private double totalDebt;
    @Column(name="INTEREST_RATE")
    private double interestRate;
    @Column(name="START_DATE")
    private LocalDate startDate;
    @Column(name="REMAINING_DEBT")
    private double remainingDebt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public double getRemainingDebt() {
        return remainingDebt;
    }

    public void setRemainingDebt(double remainingDebt) {
        this.remainingDebt = remainingDebt;
    }
}
