package com.bank.bank_system.repository;

import com.bank.bank_system.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, String> {
}
