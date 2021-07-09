package com.main.controllers;

import java.util.Comparator;

import com.main.models.HotelModel;

public class RatingSorter implements Comparator<HotelModel> 
{
    @Override
    public int compare(HotelModel o1, HotelModel o2) {
    
    	return o2.getReviews().get(i).getRating() .compareTo(o1.getReviews().get(i).getRating());
    }
}