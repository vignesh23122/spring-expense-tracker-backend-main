package com.srivignesh.springexpensetracker.services;

import com.srivignesh.springexpensetracker.models.Balance;

public interface BalanceService {
	public Balance saveBalance(Balance balance);
	public Balance createBalance();
}
