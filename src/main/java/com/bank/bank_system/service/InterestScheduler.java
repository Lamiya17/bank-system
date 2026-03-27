package com.bank.bank_system.service;

import com.bank.bank_system.entity.Deposit;
import com.bank.bank_system.repository.DepositRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterestScheduler {
    @Autowired
    DepositRepository depositRepository;
    @Scheduled(fixedRate = 864000000)
    public void calculateInterest (){
        List<Deposit> deposits = depositRepository.findAll();
        for(Deposit d :deposits){
            double interest=d.getAmount()*d.getInterestRate()/100;
            d.setAmount(d.getAmount()+interest);
            depositRepository.save(d);
        }

    }
}
