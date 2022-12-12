package com.fnl.sampolk;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FordCar extends Car {

	private int doors;

	public FordCar(int invID, String carMake, String carModel, int yearMade,
			Date startDate, Date soldDate, double carCost, double soldPrice,
			int doors) throws ClassNotFoundException {
		super(invID, carMake, carModel, yearMade, startDate, soldDate, carCost,
				soldPrice, doors);

		this.doors = doors;

		Class.forName(DERBY_DRIVER);
		Connection connection;
		try {
			connection = DriverManager.getConnection(JDBC_DERBYURL);

			connection.createStatement().execute(
					"insert into inventory values"
							+ "("
							+ invID
							+ ",'Car','"
							+ carMake
							+ "','"
							+ carModel
							+ "',"
							+ yearMade
							+ ",'"
							+ startDate
							+ "','"
							+ (soldDate + "'," + carCost + "," + soldPrice
									+ "," + this.doors + ")"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	@Override
	public void insertData() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

	}

}
