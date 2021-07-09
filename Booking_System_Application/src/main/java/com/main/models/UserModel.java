package com.main.models;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserModel {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="user_id")
Long user_id;

@Column(name="username")
String username;
@Column(name="phonenumber")
long phonenumber;


public UserModel(String username, long phonenumber) {
	super();
	this.username = username;
	this.phonenumber = phonenumber;
}
public Long getUser_id() {
	return user_id;
}
public void setUser_id(Long user_id) {
	this.user_id = user_id;
}
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="user_id", referencedColumnName="user_id")
private List<ReviewModel> reviews = new ArrayList<>();

public List<ReviewModel> getReviews() {
	return reviews;
}
public void setReviews(List<ReviewModel> reviews) {
	this.reviews = reviews;
}
public String getUser_name() {
	return username;
}
public void setUser_name(String user_name) {
	this.username = username;
}
public long getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(long phonenumber) {
	this.phonenumber = phonenumber;
}

}
