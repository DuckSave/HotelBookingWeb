package com.poly.Entity.Hotels;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Hotel")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int HotelID;
	private String Name;
	private String Location;
	private int Stars;
	private String ImageURL;
	private String Description;
	private boolean isDeleted;
	
	@OneToMany(mappedBy = "RoomID")
    HotelRoom RoomID;
	
	public Hotel() {
		super();
	}

	public Hotel(String name, String location, int stars, String imageURL, String description, boolean isDeleted) {
		super();
		Name = name;
		Location = location;
		Stars = stars;
		ImageURL = imageURL;
		Description = description;
		this.isDeleted = isDeleted;
	}



	public int getHotelID() {
		return HotelID;
	}



	public void setHotelID(int hotelID) {
		HotelID = hotelID;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getLocation() {
		return Location;
	}



	public void setLocation(String location) {
		Location = location;
	}



	public int getStars() {
		return Stars;
	}



	public void setStars(int stars) {
		Stars = stars;
	}



	public String getImageURL() {
		return ImageURL;
	}



	public void setImageURL(String imageURL) {
		ImageURL = imageURL;
	}



	public String getDescription() {
		return Description;
	}



	public void setDescription(String description) {
		Description = description;
	}



	public boolean isDeleted() {
		return isDeleted;
	}



	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
	
	
}
