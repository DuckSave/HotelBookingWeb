package com.poly.Entity.Bookings;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Bookings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne() @JoinColumn(name ="BookingID") 
	private int BookingID ; 
	private int AccountID ; 
	private Date StartDate ;
	
	public Bookings(int bookingID, int accountID, Date startDate) {
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
	public int getAccountID() {
		return AccountID;
	}
	public void setAccountID(int accountID) {
		AccountID = accountID;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	} 
	
}
