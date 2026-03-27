package com.bank.bank_system.controller;

import com.bank.bank_system.dto.CardDTO;
import com.bank.bank_system.entity.Card;
import com.bank.bank_system.service.AccountService;
import com.bank.bank_system.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cards")
public class CardController {
    @Autowired
    private CardService cardService;
    @PostMapping
    public Card createCard(@RequestBody CardDTO cardDTO) {
        return cardService.createCard(cardDTO);
    }
}
