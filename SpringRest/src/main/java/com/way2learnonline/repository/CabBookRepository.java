package com.way2learnonline.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.way2learnonline.model.CabBookings;

public interface CabBookRepository extends CrudRepository<CabBookings, Long> {

	@Query(value=" from CabBookings cb  where   DATE(cb.createDateTime)=CURDATE()")
	public Iterable<CabBookings> getTodaysBookings();
	
	
	@Query(value="from CabBookings where employeeID=?1 and routeNumber=?2 and time=?3 and  DATE(createDateTime)=CURDATE()")
	public Iterable<CabBookings> checkExistingBookings(Long employeeID,String routeNumber,String time);
}