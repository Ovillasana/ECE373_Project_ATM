package org.ATM.people;

import java.util.ArrayList;

import org.ATM.software.Account;

public class User {
	
	private String name;
	private ArrayList<Account> accountList = new ArrayList<Account>();
	private int age;
	private String birthday;
	private String address;
	private boolean VIP;
	
	public User() {
		this.name = "Unknown";
		this.age = 0;
		this.birthday = "day/month/year";
		this.address = "Unknown";
		this.VIP = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isVIP() {
		return VIP;
	}

	public void setVIP(boolean vIP) {
		VIP = vIP;
	}
	
	

}
