package com.main.bookingsystem;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.main.models.HotelModel;
import com.main.models.ReviewModel;
import com.main.models.UserModel;
import com.main.repository.HotelRepository;
import com.main.repository.ReviewRepository;
import com.main.repository.UserRepository;

@ComponentScan({"com.main.controllers","com.main.config","com.main.services"})
@EntityScan("com.main.models")
@EnableJpaRepositories(basePackages = "com.main.repository")
@SpringBootApplication
public class Booking_System implements CommandLineRunner{
	
	@Autowired
	ReviewRepository reviewrepo;
	
	@Autowired
	HotelRepository hotelrepo;
	
	@Autowired
	UserRepository userrepo;
	
	public static void main(String[] args)
	{
	SpringApplication.run(Booking_System.class,args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/**
		UserModel user = new UserModel("simrin",97544444);
		userrepo.save(user);
		HotelModel hotel = new HotelModel("Carniifia","Bangkok",new Date(2010, 1, 3),"yes","yes",2,2000,"Nonveg");
		hotelrepo.save(hotel);
		ReviewModel review = new ReviewModel(3,"V Good",user.getUser_id(),hotel.getHotel_id());
		user.getReviews().add(review);
		hotel.getReviews().add(review);
		reviewrepo.save(review);
		System.out.println("Review saved"); **/
	}
}
