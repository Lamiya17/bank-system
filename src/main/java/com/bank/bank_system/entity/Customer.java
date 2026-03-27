package com.bank.bank_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="sttm_customer")
public class Customer {
    @Id
    @Column(name="CUSTOMER_NO")
    private String customerNo;

    @NotNull
    @Column(name="FULL_NAME")
    private String fullName;

    @NotNull
    @Column(name="MOBILE_NUMBER")
    private String mobileNumber;

    @NotNull
    @Column(name="LOCAL_BRANCH")
    private String localBranch;

    @Column(name="ADDRESS_LINE1")
    private  String addressLine1;

    @Column(name="CUSTOMER_TYPE")
    private String customerType;

    @Column(name="RECORD_STAT")
    private String recordStat;

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getLocalBranch() {
        return localBranch;
    }

    public void setLocalBranch(String localBranch) {
        this.localBranch = localBranch;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getRecordStat() {
        return recordStat;
    }

    public void setRecordStat(String recordStat) {
        this.recordStat = recordStat;
    }
}
