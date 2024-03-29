package com.poly.Entity.Bookings;

import java.util.Date;
import java.util.List;

import com.poly.Entity.Account;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "Bookings")
public class Bookings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne() @JoinColumn(name ="BookingID") 
	private int BookingID ;  	
	@ManyToOne() @JoinColumn(name = "AccountID")
	List<Account> AccountID ; 
	private Date StartDate ;
	
	public Bookings(int bookingID, List<Account> accountID, Date startDate) {
		super();
		BookingID = bookingID;
		AccountID = accountID;
		StartDate = startDate;
	}
	public Bookings() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBookingID() {
		return BookingID;
	}
	public void setBookingID(int bookingID) {
		BookingID = bookingID;
	}
	public List<Account> getAccountID() {
		return AccountID;
	}
	public void setAccountID(List<Account> accountID) {
		AccountID = accountID;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	} 
	
}
