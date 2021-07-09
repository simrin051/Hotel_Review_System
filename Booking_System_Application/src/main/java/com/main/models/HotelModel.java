package com.main.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Hotel")
public class HotelModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="hotel_id")
	Long hotel_id;	
	String hotelname;
	String AC;
	String mealsincluded;
	int noofroomsavail;
	int costofoneroom;
	String mealtype;
	String location; 
	Date availdate;


	

	public HotelModel(String hotelname, String location, Date availdate, int noofroomsavail, int costofoneroom,String aCF, String mealsincluded,
			 String mealtype) {
		super();
		this.hotelname = hotelname;
		this.location = location;  
		this.availdate = availdate;
		this.noofroomsavail = noofroomsavail;
		this.costofoneroom = costofoneroom;
		this.AC = aCF;
		this.mealsincluded = mealsincluded;
		this.mealtype = mealtype; 
	}
  
	public Date getAvaildate() {
		return availdate;
	}

	public void setAvaildate(Date availdate) {
		this.availdate = availdate;
	}

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="review_fid", referencedColumnName="hotel_id")
	private List<ReviewModel> reviews = new ArrayList<>();
	
	public HotelModel()
	{
		
	}

	
	
	public Long getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(Long hotel_id) {
		this.hotel_id = hotel_id;
	}

	public String getAC() {
		return AC;
	}
	public void setAC(String aC) {
		AC = aC;
	}
	public String getMealsincluded() {
		return mealsincluded;
	}
	public void setMealsincluded(String mealsincluded) {
		this.mealsincluded = mealsincluded;
	}
	public List<ReviewModel> getReviews() {
		return reviews;
	}
	public void setReviews(List<ReviewModel> reviews) {
		this.reviews = reviews;
	}

	
public String getHotelname() {
	return hotelname;
}
public void setHotelname(String hotelname) {
	this.hotelname = hotelname;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getNoofroomsavail() {
	return noofroomsavail;
}
public void setNoofroomsavail(int noofroomsavail) {
	this.noofroomsavail = noofroomsavail;
}

public int getCostofoneroom() {
	return costofoneroom;
}
public void setCostofoneroom(int costofoneroom) {
	this.costofoneroom = costofoneroom;
}
public String getMealtype() {
	return mealtype;
}
public void setMealtype(String mealtype) {
	this.mealtype = mealtype;
}


}
