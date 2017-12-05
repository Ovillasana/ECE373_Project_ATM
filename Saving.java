package org.ATM.software;

import java.text.DecimalFormat;
import java.util.*;

public class Saving extends Account{
	private double maxDeposit;
	private double minWithdraw;
	private double maxDailyWithdraw;
	private double withdrawnToday;
	
	public Saving() {
		maxDeposit = 10000; //all arbitrary values
 		minWithdraw = 50;
		maxDailyWithdraw = 1000; 
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
		this.withdrawnToday += amount;
	}
	
	//methods
	public void transferMoney(double n) {
		
	}
	
	public void depositMoney(double n) {
		double balance = this.getBalance();
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		if(n <= maxDeposit) {
			balance += n;
			this.setBalance(balance);
			System.out.println("Requested deposit of $" + df.format(n) + " is successful.  Account number " + this.getAccountNumber() + " now has a balance of $" + df.format(this.getBalance()));
		}
		else {
			System.out.println("Error: the amount attempted to deposit is over the max deposit amount of $" + df.format(this.maxDeposit) + ".");
		}
		

			
	}
	
	public void withdrawMoney(double n) {
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		if(n < this.minWithdraw) {
			System.out.println("Error: withdraw amount must exceed " + df.format(this.minWithdraw) + ".");

		}
		else if(this.withdrawnToday >= maxDailyWithdraw) {
			System.out.println("Error: cannot withdraw any more money, user has already exceed daily withdraw limit of " + df.format(maxDailyWithdraw) + ".");
		}
		else if((this.withdrawnToday + n) > maxDailyWithdraw) {
			System.out.println("Error: the requested amount will exceed the daily withdraw limit of " + df.format(maxDailyWithdraw) + ".");
		}
		else {
			double balance = this.getBalance();
			
			balance -= n;
			
			this.setBalance(balance);
			this.withdrawnToday += n;
			System.out.println("Requested withdrawal of $" + df.format(n) + " is successful.  Account number " + this.getAccountNumber() + " now has a balance of $" + df.format(this.getBalance()));

			//User.addMoney(n); User should have some property that allows them to hold money
		}
		
	}
	
	
}
