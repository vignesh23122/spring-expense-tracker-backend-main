package com.srivignesh.springexpensetracker.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "expense_tracker_balances")
public class Balance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@DecimalMin(value = "0.0",message = "Amount cannot be less than 0.0 !")
	private double amount;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	public Balance() {
		super();
	}

	public Balance(@Positive(message = "Amount cannot be less than 0.0 !") double amount,
			@FutureOrPresent(message = "Invalid createdAt !") Date createdAt) {
		super();
		this.amount = amount;
		this.createdAt = createdAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void addAmount(double amount) {
		this.amount+=amount;
	}
	
	

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Balance [id=" + id + ", amount=" + amount + ", createdAt=" + createdAt + "]";
	}

	
	
	
}
