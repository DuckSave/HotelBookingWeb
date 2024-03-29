package com.poly.Entity.Hotels;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="HotelRooms")
public class HotelRoom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne() @JoinColumn(name="BookingID")
	private int RoomID;
	HotelBooking hotelBooking ;
	@ManyToOne @JoinColumn(name = "HotelID")
	List<Hotel> HotelID ; 
	private String RoomType;
	private boolean isAvailable;
	private boolean isBooking;
	private boolean isDeleted;
	
	public HotelRoom() {
		super();
	}

	public int getRoomID() {
		return RoomID;
	}

	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

	public HotelBooking getHotelBooking() {
		return hotelBooking;
	}

	public void setHotelBooking(HotelBooking hotelBooking) {
		this.hotelBooking = hotelBooking;
	}

	public List<Hotel> getHotelID() {
		return HotelID;
	}

	public void setHotelID(List<Hotel> hotelID) {
		HotelID = hotelID;
	}

	public String getRoomType() {
		return RoomType;
	}

	public void setRoomType(String roomType) {
		RoomType = roomType;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public boolean isBooking() {
		return isBooking;
	}

	public void setBooking(boolean isBooking) {
		this.isBooking = isBooking;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	

	
	
	
}
