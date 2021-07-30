package com.example.location.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.location.model.Location;

@RestController
public class MainController {
	
	@GetMapping("/locations")
	public List<Location> getLocations()
	{
		List<Location> retailLocation = new ArrayList<>();
		Location l1 = new Location("Location 900", "123 main street", 32.01, -128.01);
		Location l2 = new Location("Location 800", "123 main street", 32.01, -128.01);
		Location l3 = new Location("Location 700", "123 main street", 32.01, -128.01);
		Location l4 = new Location("Location 600", "123 main street", 32.01, -128.01);
		retailLocation.add(l1);
		retailLocation.add(l2);
		retailLocation.add(l3);
		retailLocation.add(l4);
		return retailLocation;
	}

}
