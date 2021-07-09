package com.main.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.main.models.HotelModel;
import com.main.models.UserModel;
import com.main.repository.UserRepository;
import com.main.services.BookingService;

@RestController
public class UserController {

	@Autowired
	BookingService userservice;
	
	@Autowired
	UserRepository userrepo;

	@GetMapping(value = "/operations")
	public ModelAndView CrudView()
	{
	    ModelAndView mav = new ModelAndView("operations"); 
	   // must match the jsp page name which is being requested.
	    mav.addObject("greeting", "GeeksForGeeks Welcomes you to Spring!");
	    mav.setViewName("operations");
        return mav;

	}
	@GetMapping( value = "/user")
	public ModelAndView UserView()
	{
		System.out.println("Inside User");
	    ModelAndView mav = new ModelAndView("User"); 
	    mav.setViewName("User");
        return mav;

	}
	@RequestMapping(method = RequestMethod.POST, params="adduser")
	public void addUser( @ModelAttribute("user") UserModel user)
	{
	  System.out.println("Add User");
	  userrepo.save(new UserModel(user.getUser_name(),user.getPhonenumber()));
	  
	}
		
	
	/**
	@RequestMapping("/index")
	
    public ModelAndView index(@Valid @ModelAttribute("simpleEntityObject") UserModel entity)  {
		System.out.println(entity.getUser_name()+" "+entity.getPhonenumber());
		ModelAndView mav = new ModelAndView();
	
	    mav.setViewName("index");

	    return mav;
    }
	
	
	@RequestMapping("/search")
	public void searchItems(@ModelAttribute("search") String data)
	{
		System.out.println("Data "+data);
	}
	
	@RequestMapping("/delete/user/{id}")
	public void deleteuser(@PathVariable int id)
	{
		userservice.deleteuserById(id);
	}

	@GetMapping(value = "/operations")
	public ModelAndView CrudView()
	{
	    ModelAndView mav = new ModelAndView("operations"); 
	   // must match the jsp page name which is being requested.
	    mav.addObject("greeting", "GeeksForGeeks Welcomes you to Spring!");
	    mav.setViewName("operations");
        return mav;

	}
	
	
	@RequestMapping( value = "/user")
	public ModelAndView userAdd()
	{
	    ModelAndView mav = new ModelAndView("User"); 
	   // must match the jsp page name which is being requested.
	    mav.addObject("greeting", "GeeksForGeeks Welcomes you to Spring!");
	    mav.setViewName("User");
        return mav;

	}
	
	@RequestMapping(method = RequestMethod.POST, params="adduser")
	public void addUser( @ModelAttribute("user") UserModel user)
	{
	  System.out.println("Add User");
	  userrepo.save(new UserModel(user.getUser_name(),user.getPhonenumber()));
	  
	}
	
	@RequestMapping(method = RequestMethod.POST, params="deleteuser")
	public void deleteUser( @ModelAttribute("user") UserModel user)
	{
	  System.out.println("Delete User");
	  userrepo.delete(user);
	}
	**/
}
