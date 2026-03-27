package com.bank.bank_system.repository;

import com.bank.bank_system.entity.Deposit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepositRepository extends JpaRepository<Deposit, String> {
}
