package com.bank.bank_system.controller;

import com.bank.bank_system.dto.DepositDTO;
import com.bank.bank_system.entity.Deposit;
import com.bank.bank_system.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deposits")
public class DepositController {
    @Autowired
    private DepositService depositService;
    @PostMapping
    public Deposit createDeposit(@RequestBody DepositDTO depositDTO) {
        return depositService.createDeposit(depositDTO);
    }
}
