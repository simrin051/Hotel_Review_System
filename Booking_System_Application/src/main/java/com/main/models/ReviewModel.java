package com.main.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Reviews")
public class ReviewModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long review_id;	
	int rating;
	String comments;
	Long userid;
	String username;
	
	Long hotelid;
	
	
	public ReviewModel()
	{
		
	}
	public ReviewModel(int rating, String comments, Long userid,	String username,Long hotelid ) {
		super();
		this.rating = rating;
		this.comments = comments;
		this.userid=userid;
		this.username=username;
		this.hotelid=hotelid;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
}
