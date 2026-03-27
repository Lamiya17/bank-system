package com.bank.bank_system.service;

import com.bank.bank_system.dto.DepositDTO;
import com.bank.bank_system.entity.Deposit;
import com.bank.bank_system.repository.DepositRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DepositService {
    @Autowired
    private DepositRepository depositRepository;
    public Deposit createDeposit(DepositDTO depositDTO) {
       Deposit deposit = new Deposit();
         deposit.setAccountNo(depositDTO.getAccountNo());
         deposit.setAmount(depositDTO.getAmount());
         deposit.setBalance(depositDTO.getAmount());
         deposit.setInterestRate(depositDTO.getInterest());
         deposit.setStartDate(LocalDate.now());
            return depositRepository.save(deposit);
    }

}
