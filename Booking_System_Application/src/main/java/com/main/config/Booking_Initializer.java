package com.main.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
public class Booking_Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	
	public Booking_Initializer()
	{
		System.out.println("Inside FormulaYard_Initializer() ");
	}
	
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Running on startup Simrin");
	}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] arr= {Booking_Config.class};
		return arr;
	}
	@Override
	protected String[] getServletMappings() {
		String[] arr= {"/*/"};
		return arr;
	}
}