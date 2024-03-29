package com.poly.Entity.Tours;

import java.util.List;

import com.poly.Entity.Bookings.Bookings;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "TourBooking")
public class TourBooking {
	@OneToMany(mappedBy = "BookingID")
	@Id 
	List<Bookings> BookingID ; 
	
	
	@OneToMany(mappedBy = "TourID") 
	@Id
	List<Tour> TourID ;
	
	
	
	public TourBooking() {
		super();
		
	}
	
		public TourBooking(List<Bookings> bookingID, List<Tour> tourID) {
		super();
		BookingID = bookingID;
		TourID = tourID;
	} 
	
	public List<Bookings> getBookingID() {
		return BookingID;
	}
	public void setBookingID(List<Bookings> bookingID) {
		BookingID = bookingID;
	}
	public List<Tour> getTourID() {
		return TourID;
	}
	public void setTourID(List<Tour> tourID) {
		TourID = tourID;
	}

	
}
