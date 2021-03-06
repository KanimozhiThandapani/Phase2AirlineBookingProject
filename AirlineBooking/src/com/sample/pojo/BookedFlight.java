package com.sample.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class BookedFlight {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookingid;
	private String username;
	private String flightcode;
	private String source;
	private String destination;
	private String airline;
	private String starttime;
	private String reachtime;
	private String price;
	
	
	public String getFlightcode() {
		return flightcode;
	}
	public void setFlightcode(String flightcode) {
		this.flightcode = flightcode;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getReachtime() {
		return reachtime;
	}
	public void setReachtime(String reachtime) {
		this.reachtime = reachtime;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

}
