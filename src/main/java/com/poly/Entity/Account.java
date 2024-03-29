package com.poly.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int AccountID;
	private String Name;
	private String Email;
	private String Password;
	private String Phone;
	private String Address;
	private boolean isManager;
	private boolean isDeleted;
	
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}


	


	public Account(String name, String email, String password, String phone, String address, boolean isManager,
			boolean isDeleted) {
		super();
		Name = name;
		Email = email;
		Password = password;
		Phone = phone;
		Address = address;
		this.isManager = isManager;
		this.isDeleted = isDeleted;
	}





	public int getAccountID() {
		return AccountID;
	}


	public void setAccountID(int accountID) {
		AccountID = accountID;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public String getPhone() {
		return Phone;
	}


	public void setPhone(String phone) {
		Phone = phone;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public boolean isDeleted() {
		return isDeleted;
	}


	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}


	public boolean isisManager() {
		return isManager;
	}


	public void setisManager(boolean isManager) {
		this.isManager = isManager;
	}
	
	
	
	
}
