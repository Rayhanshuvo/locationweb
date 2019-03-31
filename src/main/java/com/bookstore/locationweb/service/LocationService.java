package com.bookstore.locationweb.service;

import java.util.List;

import com.bookstore.locationweb.entities.Location;

public interface LocationService {

	Location saveLocation(Location location);

	Location updateLocation(Location location);

	void deleteLocation(Location location);

	Location getLocationById(int id);

	List<Location> getALlLocations();

}
