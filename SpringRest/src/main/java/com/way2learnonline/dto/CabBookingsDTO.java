package com.way2learnonline.dto;

import java.util.Date;

import com.way2learnonline.model.CabBookings;
import com.way2learnonline.model.Comment;

public class CabBookingsDTO {

	private Long bookingId;
	private String employeeName;
	private String time;
	private String routeNumber;
	private String dropPoint;
	private Date createDateTime;
	private Long employeeID;
	private String error_msg;
	public String getError_msg() {
		return error_msg;
	}
	public void setError_msg(String error_msg) {
		this.error_msg = error_msg;
	}
	public Long getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Long employeeID) {
		this.employeeID = employeeID;
	}
	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getRouteNumber() {
		return routeNumber;
	}
	public void setRouteNumber(String routeNumber) {
		this.routeNumber = routeNumber;
	}
	public String getDropPoint() {
		return dropPoint;
	}
	public void setDropPoint(String dropPoint) {
		this.dropPoint = dropPoint;
	}
	public Date getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}
	public Date getModifiedDateTime() {
		return modifiedDateTime;
	}
	public void setModifiedDateTime(Date modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}
	private Date modifiedDateTime;
	
	
	
	public  CabBookings bookNewCab() {
		CabBookings cabBookings= new CabBookings();
		cabBookings.setEmployeeName(employeeName);
		cabBookings.setDropPoint(dropPoint);
		cabBookings.setRouteNumber(routeNumber);
		cabBookings.setTime(time);
		cabBookings.setEmployeeID(employeeID);
		return cabBookings;
	}
	
	public  CabBookingsDTO createCabBookingDTO(CabBookings cabBookings, CabBookingsDTO cabBookingsDTO){
		cabBookingsDTO.setBookingId(cabBookings.getBookingId());
		cabBookingsDTO.setCreateDateTime(cabBookings.getCreateDateTime());
		cabBookingsDTO.setDropPoint(cabBookings.getDropPoint());
		cabBookingsDTO.setEmployeeName(cabBookings.getEmployeeName());
		cabBookingsDTO.setModifiedDateTime(cabBookings.getModifiedDateTime());
		cabBookingsDTO.setRouteNumber(cabBookings.getRouteNumber());
		cabBookingsDTO.setTime(cabBookings.getTime());
		cabBookingsDTO.setEmployeeID(cabBookings.getEmployeeID());
		return cabBookingsDTO;
	}
	public static  CabBookingsDTO createCabBookingDTO(CabBookings cabBookings){
		 CabBookingsDTO cabBookingsDTO = new CabBookingsDTO();
		cabBookingsDTO.setBookingId(cabBookings.getBookingId());
		cabBookingsDTO.setCreateDateTime(cabBookings.getCreateDateTime());
		cabBookingsDTO.setDropPoint(cabBookings.getDropPoint());
		cabBookingsDTO.setEmployeeName(cabBookings.getEmployeeName());
		cabBookingsDTO.setModifiedDateTime(cabBookings.getModifiedDateTime());
		cabBookingsDTO.setRouteNumber(cabBookings.getRouteNumber());
		cabBookingsDTO.setTime(cabBookings.getTime());
		cabBookingsDTO.setEmployeeID(cabBookings.getEmployeeID());
		return cabBookingsDTO;
	}
}
