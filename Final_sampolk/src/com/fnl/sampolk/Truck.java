package com.fnl.sampolk;

import java.sql.Date;

public abstract class Truck extends Vehicle {
	
	private String type;
	private int wheels;

	

	public Truck(int invID, String carMake, String carModel, int yearMade,
			Date startDate, Date soldDate, double carCost, double soldPrice, int wheels) {
		super(invID, carMake, carModel, yearMade, startDate, soldDate, carCost,
				soldPrice);
	 	
		this.wheels = wheels;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public abstract void insertData();

}