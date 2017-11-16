package org.ATM.hardware;

import java.util.ArrayList;

import org.ATM.people.User;

public class ATM{

	public final ArrayList<User> userList = new ArrayList<User>();
	public double moneyAvailable;
	public double moneyWithdrawn;
	
	public ATM() {
		this.moneyAvailable = 0.00;
		this.moneyWithdrawn = 0.00;
		
	}

	public double getMoneyAvailable() {
		return moneyAvailable;
	}

	public void setMoneyAvailable(double moneyAvailable) {
		this.moneyAvailable = moneyAvailable;
	}

	public double getMoneyWithdrawn() {
		return moneyWithdrawn;
	}

	public void setMoneyWithdrawn(double moneyWithdrawn) {
		this.moneyWithdrawn = moneyWithdrawn;
	}

	public ArrayList<User> getUserList() {
		return userList;
	}
	
	public void createAccount() {
		
		
	}
	
	
}
