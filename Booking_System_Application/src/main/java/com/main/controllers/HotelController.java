package com.main.controllers;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.main.models.HotelModel;
import com.main.repository.HotelRepository;
import com.main.services.BookingService;
import java.util.*;
@RestController
public class HotelController {
	
	@Autowired
	BookingService bookingservice;
	
	@Autowired
	HotelRepository hotelrepo;
	
	@RequestMapping("/delete/hotel/{id}")
	public void deleteuser(@PathVariable int id)
	{
		bookingservice. deletehotelById(id);
	}
	@GetMapping(value = "/hotel")
	public ModelAndView CrudView()
	{
		System.out.println("Inside CrudView");
	    ModelAndView mav = new ModelAndView("Hotel"); 
	   // must match the jsp page name which is being requested.
	    mav.addObject("greeting", "GeeksForGeeks Welcomes you to Spring!");
	    mav.setViewName("Hotel");
        return mav;

	}
	
	@RequestMapping(method = RequestMethod.POST, params="add")
	public void addHotel( @ModelAttribute("hotel") HotelModel hotel)
	{
	  System.out.println("Add Hotel");
	  System.out.println(hotel.getHotelname()+" "+hotel.getLocation());

	  hotelrepo.save(new HotelModel(hotel.getHotelname(),hotel.getLocation(), hotel.getAvaildate(),
			  hotel.getNoofroomsavail(), hotel.getCostofoneroom(), hotel.getAC(), hotel.getMealsincluded(), hotel.getMealtype()));
	}
	@RequestMapping(method = RequestMethod.POST, params="delete")
	public void deleteHotel( @ModelAttribute("hotel") HotelModel hotel)
	{
	  System.out.println("Delete Hotel");
	  System.out.println(hotel.getHotelname()+" "+hotel.getLocation());

	}
	
	
	@GetMapping(value = "/search")
	public ModelAndView Search()
	{
	    ModelAndView mav = new ModelAndView("search"); 
	   // must match the jsp page name which is being requested.
	    mav.addObject("greeting", "GeeksForGeeks Welcomes you to Spring!");
	    mav.setViewName("search");
        return mav;

	}
	@RequestMapping(method = RequestMethod.POST, params="search")
	public void searchHotels( @ModelAttribute("searchhotel") HotelModel hotel)
	{
	List<HotelModel> hotels	=hotelrepo.findAll();
	List<HotelModel> curated_hotels= new ArrayList<HotelModel>();
	for(int i=0;i<hotels.size();i++)
	{
		if(hotel.getLocation().equals(hotel.getLocation()))
		{
			curated_hotels.add(hotel);
		}
	}
	  curated_hotels.sort(new RatingSorter());
	}
	
}

