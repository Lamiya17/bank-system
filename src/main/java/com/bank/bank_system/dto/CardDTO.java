package com.bank.bank_system.dto;

public class CardDTO {
    private String requestReferenceNo;
    private String nameOnCard;
    private String cardAccNo;

    public String getRequetReferenceNo() {
        return requestReferenceNo;
    }

    public void setRequsetReferenceNo(String requetReferenceNo) {
        this.requestReferenceNo = requetReferenceNo;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getCardAccNo() {
        return cardAccNo;
    }

    public void setCardAccNo(String cardAccNo) {
        this.cardAccNo = cardAccNo;
    }
}
