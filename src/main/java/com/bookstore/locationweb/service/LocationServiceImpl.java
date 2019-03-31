package com.bookstore.locationweb.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.locationweb.entities.Location;
import com.bookstore.locationweb.repos.LocationRepos;

@Service
@Transactional
public class LocationServiceImpl implements LocationService{

	@Autowired
	private LocationRepos repository;
	
	@Override
	public Location saveLocation(Location location) {
		// TODO Auto-generated method stub
		return repository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		// TODO Auto-generated method stub
		return repository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		// TODO Auto-generated method stub
		repository.delete(location);
		
	}

	@Override
	public Location getLocationById(int id) {
		// TODO Auto-generated method stub
		return repository.getOne(id);
	}

	@Override
	public List<Location> getALlLocations() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public LocationRepos getRepository() {
		return repository;
	}

	public void setRepository(LocationRepos repository) {
		this.repository = repository;
	}

}
