package com.srivignesh.springexpensetracker.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srivignesh.springexpensetracker.models.Balance;

public interface BalanceRepository extends JpaRepository<Balance, Long> {

}
