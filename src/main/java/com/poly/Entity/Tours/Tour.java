package com.poly.Entity.Tours;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Tour")
public class Tour {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int TourID;
	private String Name;
	private String Location;
	private int Stars;
	private String ImageURL;
	private String Description;
	private boolean isDeleted;
	
	@ManyToOne() @JoinColumn(name = "TourBookingID") 
    TourBooking RoomID;


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
