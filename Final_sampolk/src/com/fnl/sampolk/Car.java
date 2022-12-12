package com.fnl.sampolk;

import java.sql.Date;
import java.sql.SQLException;

public abstract class Car extends Vehicle {
	
	private String type;
	private int doors;


	public Car(int invID, String carMake, String carModel, int yearMade,
			Date startDate, Date soldDate, double carCost, double soldPrice, int doors) {
		super(invID, carMake, carModel, yearMade, startDate, soldDate, carCost,
				soldPrice);
		this.doors = doors;
		// TODO Auto-generated constructor stub
	}
	
	public String getType() {
		return "Car";
	}

	public void setType(String type) {
		type = type;
	}
	
	public int getDoors() {
		return doors;
	}

	public void setDoor(int door) {
		this.doors = doors;
	}

	@Override
	public abstract void insertData() throws ClassNotFoundException, SQLException;

}
