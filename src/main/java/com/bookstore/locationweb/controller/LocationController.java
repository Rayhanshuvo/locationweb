package com.bookstore.locationweb.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.locationweb.emailutil.EmailUtil;
import com.bookstore.locationweb.entities.Location;
import com.bookstore.locationweb.service.LocationServiceImpl;


@RestController
@RequestMapping("/api")
public class LocationController {
	
	@Autowired
	private LocationServiceImpl service;
	
	@Autowired
	private EmailUtil emailutil;
	
	@PostMapping
	public Location saveLocation(@RequestBody Location location ) {
		
		emailutil.sendEmail("springboot1221@gmail.com", "Location saved", "Location saved successfully");
		return service.saveLocation(location);
		
	}
	
	

}
