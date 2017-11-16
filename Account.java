package org.ATM.software;

import java.util.*;

public abstract class Account {
	
	private double accountNumber;
	private double balance;
	public int pin;
	private ArrayList<String> userList;
	
	public Account() {
		accountNumber = 0;
		balance = 0;
		userList = new ArrayList<String>();
	}
	
	//setters and getters
	public int getPin() {
		return pin;
	}
	
	public void setPin(int n) {
		this.pin = n;
	}
	
	public double getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(double n) {
		this.accountNumber = n;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double amount) {
		this.balance = amount;
	}
	
	public ArrayList<String> getUsers(){
		return userList;
	}
	
	public void setUsers(ArrayList<String> u) {
		this.userList = u;
	}
	
	//methods
	
	//need to check if user knows pin before doing anything with account
	public boolean requestPin(int n) {		
		if(n == this.pin) {
			return true;
		}
		
		return false;
	}
	
	public abstract void transferMoney(double amount);
	
	public abstract void depositMoney(double amount);
	
	public abstract void withdrawMoney(double amount);
	
	
}
