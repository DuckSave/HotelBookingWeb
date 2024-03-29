package com.poly.Entity.Tours;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Tours")
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
	public Tour() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tour(int tourID, String name, String location, int stars, String imageURL, String description,
			boolean isDeleted) {
		super();
		TourID = tourID;
		Name = name;
		Location = location;
		Stars = stars;
		ImageURL = imageURL;
		Description = description;
		this.isDeleted = isDeleted;
	}
	public int getTourID() {
		return TourID;
	}
	public void setTourID(int tourID) {
		TourID = tourID;
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
