package org.ATM.software;

import java.io.Serializable;
import java.util.*;

public abstract class Account implements Serializable {
	
	private int accountNumber;
	private double balance;
	public int pin;
	public int failCounter;
	public boolean pinBoolean;
	private ArrayList<String> userList;
	
	public Account() {
		accountNumber = 0;
		balance = 0;
		userList = new ArrayList<String>();
		failCounter = 0;
		pin = 0;
		pinBoolean = false;
	}
	
	//setters and getters
	public boolean getPinBoolean() {
		return pinBoolean;
	}
	
	public void setPinBoolean(boolean n) {
		pinBoolean = n;
	}
	public int getPin() {
		return pin;
	}
	
	public void setPin(int n) {
		this.pin = n;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int n) {
		this.accountNumber = n;
	}
	
	public int getFailCounter() {
		return failCounter;
	}
	
	public void setFailCounter(int n) {
		this.failCounter = n;
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
	public void createPIN(String n) {
		if(n.length() != 4) {
			System.out.println("Error: PIN must be four digits.");
			return;
		}
		else {
			this.setPin(Integer.parseInt(n));
			System.out.println("New PIN successfully created!");
			this.setPinBoolean(false);
		}
	}
	public boolean requestPin(int n) {		
		if(n == this.pin) {
			this.setPinBoolean(true);
			return true;
		}
		this.setPinBoolean(false);
		failCounter += 1;
		System.out.println("Incorrect PIN");
		return false;
	}
	
	public abstract void transferMoney(double amount);
	
	public abstract void depositMoney(double amount);
	
	public abstract void withdrawMoney(double amount);
	
	
}
