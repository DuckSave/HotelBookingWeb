package com.poly.Entity.Cars;

import java.util.List;

import com.poly.Entity.Bookings.Bookings;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="CarBooking")

public class CarBooking {	
	@OneToMany()@JoinColumn(name ="BookingID")
	@Id
	List<Bookings> BookingID ; 
	@OneToMany() @JoinColumn(name = "CarID")
	@Id
	List<Cars> CarID ;
	
	
	public CarBooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarBooking(List<Bookings> bookingID, List<Cars> carID) {
		super();
		BookingID = bookingID;
		CarID = carID;
	}
	public List<Bookings> getBookingID() {
		return BookingID;
	}
	public void setBookingID(List<Bookings> bookingID) {
		BookingID = bookingID;
	}
	public List<Cars> getCarID() {
		return CarID;
	}
	public void setCarID(List<Cars> carID) {
		CarID = carID;
	} 
	
}
