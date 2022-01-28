package com.srivignesh.springexpensetracker.services;

import java.util.List;

import com.srivignesh.springexpensetracker.models.Expense;
import com.srivignesh.springexpensetracker.models.User;

public interface ExpenseService {
	public Expense saveExpense(Expense expense);
	public List<Expense> filterExpenseBetween(String startDate,String endDate);
	public List<Expense> filterUserExpenseBetween(User user,String startDate,String endDate);
	public void deleteByUserAndID(User user,long id);
}
