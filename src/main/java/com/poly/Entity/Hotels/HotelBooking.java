package com.poly.Entity.Hotels;

import java.util.List;

import com.poly.Entity.Bookings.Bookings;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="HotelBooking")
public class HotelBooking {
	@Id
	@OneToMany(mappedBy = "BookingID")
	List<Bookings> BookingID ; 
	@Id 
	@OneToMany(mappedBy = "RoomID")
	List<HotelRoom> RoomID ; 
	
	public HotelBooking() {
		super();
		
	}

	public List<Bookings> getBookingID() {
		return BookingID;
	}

	public void setBookingID(List<Bookings> bookingID) {
		BookingID = bookingID;
	}

	public List<HotelRoom> getRoomID() {
		return RoomID;
	}

	public void setRoomID(List<HotelRoom> roomID) {
		RoomID = roomID;
	}

	
	
	
}
