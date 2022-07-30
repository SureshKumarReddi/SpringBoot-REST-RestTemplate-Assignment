package com.Suresh.SpringBoot.Models;

public class Flight {

	private String code;
	private int price;
	private String origin;
	private String destination;
	private String departureDate;
	private String planeType;
	private String airlineName;
	private int emptySeats;

	public Flight() {
			// TODO Auto-generated constructor stub
		}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public int getEmptySeats() {
		return emptySeats;
	}

	public void setEmptySeats(int emptySeats) {
		this.emptySeats = emptySeats;
	}

	@Override
	public String toString() {
		return "Flight [code=" + code + ", price=" + price + ", origin=" + origin + ", destination=" + destination
				+ ", departureDate=" + departureDate + ", planeType=" + planeType + ", airlineName=" + airlineName
				+ ", emptySeats=" + emptySeats + "]";
	}

	
}
