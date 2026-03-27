package com.bank.bank_system.service;

import com.bank.bank_system.dto.CreditDTO;
import com.bank.bank_system.entity.Credit;
import com.bank.bank_system.repository.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CreditService {
    @Autowired
    private CreditRepository creditRepository;
    public Credit createCredit(CreditDTO creditDTO){
        Credit credit = new Credit();
        credit.setAccountNo(creditDTO.getAccountNo());
        credit.setTotalDebt(creditDTO.getTotalDebt());
        credit.setInterestRate(creditDTO.getInterestRate());
        credit.setRemainingDebt(creditDTO.getTotalDebt());
        credit.setStartDate(LocalDate.now());
        return creditRepository.save(credit);
    }
    public void pay(int id, double amount){
        Credit credit = creditRepository.findById(id).orElseThrow();
        double remainingDebt = credit.getRemainingDebt() - amount;
        credit.setRemainingDebt(remainingDebt);
        creditRepository.save(credit);
    }
}
