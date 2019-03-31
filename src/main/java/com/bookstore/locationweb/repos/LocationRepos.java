package com.bookstore.locationweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.locationweb.entities.Location;

@Repository
public interface LocationRepos extends JpaRepository<Location, Integer> {
	

}
