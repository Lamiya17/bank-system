package com.bank.bank_system.service;

import com.bank.bank_system.dto.AccountDTO;
import com.bank.bank_system.entity.Account;
import com.bank.bank_system.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    public Account createAccount(AccountDTO accountDTO) {
        Account account = new Account();
        account.setCustAccNo(accountDTO.getCustAccNo());
        account.setCustNo(accountDTO.getCustNo());
        account.setBranchCode(accountDTO.getBranchCode());
        account.setCcy("USD");
        account.setRecordStat("OPEN");
        account.setAcDesc("springboot account");
        account.setOpenDate(LocalDate.now());
        return accountRepository.save(account);
    }
}
