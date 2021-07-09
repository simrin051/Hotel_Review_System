package com.main.services;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.main.models.HotelModel;
import com.main.models.UserModel;
import com.main.repository.HotelRepository;
import com.main.repository.UserRepository;


@Service
public class BookingService {
	
	UserRepository urepository;
	HotelRepository hrepository;
	HotelModel hotel;
	public UserModel deleteuserById(int id)  
	{  
	List<UserModel> users=urepository.findAll();
	Iterator<UserModel> iterator = users.iterator();  
	while(iterator.hasNext())  
	{  
	UserModel user=iterator.next();  
	if(user.getUser_id()==id)  
	{  
	iterator.remove();  
	return user; //returns the deleted resource back  
	}  
	}  
	return null;  
	}  
	public HotelModel deletehotelById(int id)  
	{  
	List<HotelModel> hotels=hrepository.findAll();
	Iterator<HotelModel> iterator = hotels.iterator();  
	while(iterator.hasNext())  
	{  
	 hotel=iterator.next();  
 
	}
	return hotel;  
	  
	}  
	
}
