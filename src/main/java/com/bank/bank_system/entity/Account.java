package com.bank.bank_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name="sttm_cust_account")
public class Account {
    @Id
    @Column(name="CUST_NO")
    private String custNo;
    @Column(name="CUST_AC_NO")
    private String custAccNo;
    @Column(name="BRANCH_CODE")
    private String branchCode;
    @Column(name="AC_DESC")
    private String acDesc;
    @Column(name="CCY")
    private String ccy;
    @Column(name="RECORD_STAT")
    private String recordStat;
    @Column(name="AC_OPEN_DATE")
    private LocalDate openDate;

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCustAccNo() {
        return custAccNo;
    }

    public void setCustAccNo(String custAccNo) {
        this.custAccNo = custAccNo;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getAcDesc() {
        return acDesc;
    }

    public void setAcDesc(String acDesc) {
        this.acDesc = acDesc;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getRecordStat() {
        return recordStat;
    }

    public void setRecordStat(String recordStat) {
        this.recordStat = recordStat;
    }

    public LocalDate getOpenDate() {
        return openDate;
    }

    public void setOpenDate(LocalDate openDate) {
        this.openDate = openDate;
    }
}
