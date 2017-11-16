package org.ATM.software;

import java.util.*;

public class Checking extends Account{
	private double maxDeposit;
	private double minWithdraw;
	private double maxDailyWithdraw;
	private double withdrawnToday;
	
	public Checking() {
		maxDeposit = 1000; //all arbitrary values
 		minWithdraw = 5;
		maxDailyWithdraw = 100; 
		withdrawnToday = 0;
	}
	
	//setters and getters
	public double getMaxDeposit() {
		return maxDeposit;
	}
	
	public void setMaxDeposit(double amount) {
		this.maxDeposit = amount;
	}
	
	public double getMinWithdraw() {
		return minWithdraw;
	}
	
	public void setMinWithdraw(double amount) {
		this.minWithdraw = amount;
	}
	
	public double getMaxDailyWithdraw() {
		return maxDailyWithdraw;
	}
	
	public void setMaxDailyWithdraw(double amount) {
		this.maxDailyWithdraw = amount;
	}
	
	public double getWithdrawnToday() {
		return withdrawnToday;
	}
	
	public void setWithdrawnToday(double amount) {
		this.withdrawnToday = amount;
	}
	
	//methods
	public void transferMoney(double n) {
		
	}
	
	public void depositMoney(double n) {
		double balance = this.getBalance();
		
		if(n <= maxDeposit) {
			balance += n;
			this.setBalance(balance);
		}
		else {
			System.out.println("Error: the amount attempted to deposit is over the max deposit amount of " + this.maxDeposit + ".");
		}
			
	}
	
	public void withdrawMoney(double n) {
		
		if(n < this.minWithdraw) {
			System.out.println("Error: withdraw amount must exceed " + this.minWithdraw + ".");

		}
		else if(this.withdrawnToday >= maxDailyWithdraw) {
			System.out.println("Error: cannot withdraw any more money, user has already exceed daily withdraw limit of " + maxDailyWithdraw + ".");
		}
		else if((this.withdrawnToday + n) > maxDailyWithdraw) {
			System.out.println("Error: the requested amount will exceed the daily withdraw limit of " + maxDailyWithdraw + ".");
		}
		else {
			double balance = this.getBalance();
			
			balance -= n;
			
			this.setBalance(balance);
			
			//User.addMoney(n); User should have some property that allows them to hold money
		}
		
	}
	
	
}
