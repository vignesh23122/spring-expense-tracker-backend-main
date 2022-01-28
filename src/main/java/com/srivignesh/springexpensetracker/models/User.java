package com.srivignesh.springexpensetracker.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "expense_tracker_users")
public class User{
	/**
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotBlank(message = "username is required !")
	@Column(unique = true)
	@Size(min = 5,max = 15,message = "username must be exactly 10 characters in length !")
	@Pattern(regexp = "^[a-zA-z][a-zA-Z0-9_]{4,14}$",message = "Username can contain only alphabets, numbers and underscore only !")
	private String username;
	
	@Email(message = "Must be a valid Email !")
	@NotBlank(message = "Email is required !")
	@Size(min = 5, max = 256, message = "Email must be between 5 and 256 characters in length !")
	private String email;
	
	@NotBlank(message = "Password is required !")
	@Size(min = 8 , message = "Password must be greater than 8 characters in length !")
	private String password;
	
	@NotBlank(message = "FirstName is required !")
	@Size(min = 3 , max = 100 , message = "FirstName must be between 3 and 100 characters in length !")
	private String firstName;
	
	@NotBlank(message = "LastName is required !")
	@Size(min = 1 , max = 100 , message = "LastName must be between 3 and 100 characters in length !")
	private String lastName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Balance balance;
	
	@OrderBy("createdAt DESC")
	@OneToMany(fetch = FetchType.LAZY ,mappedBy = "user", cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Expense> expensesList;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	
	public User() {
		super();
	}
	
	

	public User(
			@NotBlank(message = "username is required !") @Size(min = 10, max = 10, message = "username must be exactly 10 characters in length !") String username,
			@Email(message = "Must be a valid Email !") @NotBlank(message = "Email is required !") @Size(min = 5, max = 256, message = "Email must be between 5 and 256 characters in length !") String email,
			@NotBlank(message = "Password is required !") @Size(min = 8, message = "Password must be greater than 8 characters in length !") String password,
			@NotBlank(message = "FirstName is required !") @Size(min = 3, max = 100, message = "FirstName must be between 3 and 100 characters in length !") String firstName,
			@NotBlank(message = "LastName is required !") @Size(min = 3, max = 100, message = "LastName must be between 3 and 100 characters in length !") String lastName,
			Balance balance, List<Expense> expensesList, Date createdAt) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
		this.expensesList = expensesList;
		this.createdAt = createdAt;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public Balance getBalance() {
		return balance;
	}



	public void setBalance(Balance balance) {
		this.balance = balance;
	}



	public List<Expense> getExpensesList() {
		return expensesList;
	}



	public void setExpensesList(List<Expense> expensesList) {
		this.expensesList = expensesList;
	}
	
	public void addExpenses(Expense expense){
		this.expensesList.add(expense);
	}



	public Date getCreatedAt() {
		return createdAt;
	}



	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", createdAt=" + createdAt + "]";
	}



	
	
}
