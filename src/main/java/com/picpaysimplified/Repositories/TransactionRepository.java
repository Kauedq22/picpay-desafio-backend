package com.picpaysimplified.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpaysimplified.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    
}
