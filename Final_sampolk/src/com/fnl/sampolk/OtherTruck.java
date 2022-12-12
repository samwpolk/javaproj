package com.fnl.sampolk;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OtherTruck extends Truck {

	private int wheels;

	public OtherTruck(int invID, String carMake, String carModel, int yearMade,
			Date startDate, Date soldDate, double carCost, double soldPrice,
			int wheels) throws ClassNotFoundException {
		super(invID, carMake, carModel, yearMade, startDate, soldDate, carCost,
				soldPrice, wheels);
		this.wheels = wheels;

		Class.forName(DERBY_DRIVER);
		Connection connection;
		try {
			connection = DriverManager.getConnection(JDBC_DERBYURL);

			connection.createStatement().execute(
					"insert into inventory values"
							+ "("
							+ invID
							+ ",'Truck','"
							+ carMake
							+ "','"
							+ carModel
							+ "',"
							+ yearMade
							+ ",'"
							+ startDate
							+ "','"
							+ (soldDate + "'," + carCost + "," + soldPrice
									+ "," + this.wheels + ")"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public void insertData() {
		// TODO Auto-generated method stub

	}

}