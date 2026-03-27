package com.bank.bank_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@Table(name="sttm_debit_card_master")
public class Card {
    @Id
    @Column(name="REQUEST_REFERENCE_NO")
    private String requestReferenceNo;
    @Column(name="NAME_ON_CARD")
    private String nameOnCard;
    @NotNull
    @Column(name="CARD_PRODUCT")
    private String cardProduct;
    @NotNull
    @Column(name="ISSUER")
    private String issuer;
    @Column(name="CUST_AC_NO")
    private String custAcNo;
    @Column(name="CUST_NO")
    private String custNo;
    @Column(name="CARD_EXPIRY_DT")
    private LocalDate cardExpiryDt;
    @Column(name="CARD_APPL_DATE")
    private LocalDate cardApplDate;
    @Column(name="CARD_BIN")
    private String cardBin;
    @Column(name="LAST_OPERATION")
    private String lastOperation;
    @Column(name="REMARKS")
    private String remarks;
    @Column(name="BRANCH_CODE")
    private String branchCode;

    public String getRequestReferenceNo() {
        return requestReferenceNo;
    }

    public void setRequestReferenceNo(String requestReferenceNo) {
        this.requestReferenceNo = requestReferenceNo;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getCardProduct() {
        return cardProduct;
    }

    public void setCardProduct(String cardProduct) {
        this.cardProduct = cardProduct;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getCustAcNo() {
        return custAcNo;
    }

    public void setCustAcNo(String custAcNo) {
        this.custAcNo = custAcNo;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public LocalDate getCardExpiryDt() {
        return cardExpiryDt;
    }

    public void setCardExpiryDt(LocalDate cardExpiryDt) {
        this.cardExpiryDt = cardExpiryDt;
    }

    public LocalDate getCardApplDate() {
        return cardApplDate;
    }

    public void setCardApplDate(LocalDate cardApplDate) {
        this.cardApplDate = cardApplDate;
    }

    public String getCardBin() {
        return cardBin;
    }

    public void setCardBin(String cardBin) {
        this.cardBin = cardBin;
    }

    public String getLastOperation() {
        return lastOperation;
    }

    public void setLastOperation(String lastOperation) {
        this.lastOperation = lastOperation;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }
}
