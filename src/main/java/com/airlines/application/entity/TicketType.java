package com.airlines.application.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.airlines.application.constant.TicketTypes;

@Entity
public class TicketType {
	
	@Id
	String ticketCode;
	
	TicketTypes ticketTypes;
	
	
	public String getTicketCode() {
		return ticketCode;
	}
	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}
	public TicketTypes getTicketTypes() {
		return ticketTypes;
	}
	public void setTicketTypes(TicketTypes ticketTypes) {
		this.ticketTypes = ticketTypes;
	}
	 
	
	
	

}
