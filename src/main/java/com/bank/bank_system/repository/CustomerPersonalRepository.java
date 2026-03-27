package com.bank.bank_system.repository;

import com.bank.bank_system.entity.CustomerPersonal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerPersonalRepository extends JpaRepository<CustomerPersonal,Integer> {
}
