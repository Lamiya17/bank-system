package com.bank.bank_system.controller;

import com.bank.bank_system.dto.CreditDTO;
import com.bank.bank_system.entity.Credit;
import com.bank.bank_system.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/credits")
public class CreditController {
    @Autowired
    private CreditService creditService;
    @PostMapping
    public Credit createCredit(@Valid @RequestBody CreditDTO creditDTO) {
        return creditService.createCredit(creditDTO);
    }
    @PostMapping("/pay")
    public void pay(@RequestParam int id, @RequestParam double amount) {
        creditService.pay(id, amount);
    }
}
