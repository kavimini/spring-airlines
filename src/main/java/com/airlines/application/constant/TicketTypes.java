package com.airlines.application.constant;

public enum TicketTypes {
	
	GOLD_CLASS("gold"),
	SILVER_CLASS("silver"),
	ECONOMY("economy");

	public final String type;

    private TicketTypes(String type) {
        this.type = type;
    }
	

}
