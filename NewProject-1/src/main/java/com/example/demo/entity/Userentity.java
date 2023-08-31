package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Userentity {
	@Id
	private int id;
	private String name;
	private int passport_id;
	private String flight_name;
	private String source;
	private String departure;
	private String date;
	private String arrival_time;
	private String departure_time;
	private String flight_charges;
	
	
	
	public Userentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Userentity(int id, String name, int passport_id, String flight_name, String source, String departure, String date,
			String arrival_time, String departure_time, String flight_charges) {
		super();
		this.id = id;
		this.name = name;
		this.passport_id=passport_id;
		this.flight_name=flight_name;
		this.source=source;
		this.date=date;
		this.arrival_time=arrival_time;
		this.departure_time=departure_time;
		this.flight_charges=flight_charges;
		
	}
		
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassport_id() {
		return passport_id;
	}
	public void setPassport_id(int passport_id) {
		this.passport_id = passport_id;
	}
	public String getFlight_name() {
		return flight_name;
	}
	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}

	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public String getFlight_charges() {
		return flight_charges;
	}
	public void setFlight_charges(String flight_charges) {
		this.flight_charges = flight_charges;
	}

}
