package com.bank.bank_system.service;

import com.bank.bank_system.dto.CardDTO;
import com.bank.bank_system.entity.Card;
import com.bank.bank_system.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CardService {
    @Autowired
    private CardRepository cardRepository;
    public Card createCard(CardDTO cardDTO) {
        Card card = new Card();
        card.setRequestReferenceNo(cardDTO.getRequetReferenceNo());
        card.setNameOnCard(cardDTO.getNameOnCard());
        card.setCustAcNo(cardDTO.getCardAccNo());
        card.setCardBin("123456");
        card.setCardProduct("Debit Card");
        card.setBranchCode("001");
        card.setIssuer("Bank XYZ");
        card.setLastOperation("Card Created");
        card.setRemarks("Card created successfully");
        card.setCardExpiryDt(LocalDate.now());
        card.setCardApplDate(LocalDate.now());
        return cardRepository.save(card);
    }
}
