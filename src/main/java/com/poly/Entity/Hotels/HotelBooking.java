package com.poly.Entity.Hotels;

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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int HotelBookingID;
	@OneToMany(mappedBy = "RoomID")
	HotelRoom RoomID;
	
	public HotelBooking() {
		super();
		
	}

	public int getHotelBookingID() {
		return HotelBookingID;
	}

	public void setHotelBookingID(int HotelBookingID) {
		this.HotelBookingID = HotelBookingID;
	}

	public HotelRoom getRoomID() {
		return RoomID;
	}

	public void setRoomID(HotelRoom roomID) {
		RoomID = roomID;
	}
	
	
}
