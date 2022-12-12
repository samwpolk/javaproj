package com.fnl.sampolk;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static final String DERBY_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	public static final String JDBC_DERBYURL = "jdbc:derby:inventory;create=false";
	public static final String SQL_STATEMENT = "SELECT DISTINCT * from inventory ORDER BY INVENTORY_ID ASC";
	public static final String SQL_PROFIT = "SELECT SUM(SOLD_PRICE - DEALER_COST) AS TOTAL_PROFIT from inventory";
	public static final String SQL_SALES = "SELECT SUM(SOLD_PRICE) AS TOTAL_SALES from inventory";
	public static final String SQL_COUNT = "SELECT COUNT(DISTINCT INVENTORY_ID ) AS CARS_SOLD from inventory";
	public static final String SQL_FORD_CARS = "SELECT COUNT(DISTINCT INVENTORY_ID)  AS FORD_CARS_SOLD  FROM INVENTORY WHERE (TYPE = 'Car' AND MAKE='Ford')";
	public static final String SQL_TRUCKS = "SELECT COUNT(DISTINCT INVENTORY_ID)  AS TRUCKS_SOLD  FROM INVENTORY WHERE (TYPE = 'Truck')";
	public static final String SQL_STATEMENT_PRICE = "SELECT DISTINCT * from inventory ORDER BY SOLD_PRICE ASC";

	static void report(String SQL) throws SQLException {

		Connection connection = DriverManager
				.getConnection(CreateCarInventoryDB.JDBC_DERBYURL);

		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery(SQL);

		ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

		int columnCount = resultSetMetaData.getColumnCount();
		for (int x = 1; x <= columnCount; x++)
			System.out.format("%25s", resultSetMetaData.getColumnName(x));
		while (resultSet.next()) {
			System.out.println();
			for (int x = 1; x <= columnCount; x++)
				System.out.format("%25s", resultSet.getString(x));
		}
		statement.close();
		connection.close();
		System.out.println();

	}

	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {

		FordCar fc;
		OtherCar oc;
		FordTruck ft;
		DodgeCar dc;
		OtherTruck ot;

		fc = new FordCar(1, "Ford", "Crown Victoria", 2010,
				Date.valueOf("2010-7-3"), Date.valueOf("2012-7-23"), 8900.00,
				14000.00, 4);

		oc = new OtherCar(2, "Toyata", "Camry", 2009,
				Date.valueOf("2010-7-23"), Date.valueOf("2012-7-27"), 7600.00,
				17500.00, 4);

		ft = new FordTruck(3, "Ford", "F-150", 2010, Date.valueOf("2010-7-21"),
				Date.valueOf("2012-7-29"), 17600.00, 27500.00, 4);

		dc = new DodgeCar(5, "Dodge", "Caravan", 2009,
				Date.valueOf("2010-7-7"), Date.valueOf("2012-7-18"), 2600.00,
				39500.00, 4);

		ot = new OtherTruck(4, "GMC", "Sierra 1500", 2009,
				Date.valueOf("2010-7-2"), Date.valueOf("2012-7-24"), 11600.00,
				19500.00, 4);

		fc = new FordCar(6, "Ford", "Mustang", 2009, Date.valueOf("2010-7-14"),
				Date.valueOf("2012-8-23"), 12600.00, 25600.00, 2);

		ft = new FordTruck(7, "Ford", "F-450", 2010, Date.valueOf("2010-7-20"),
				Date.valueOf("2012-7-30"), 17600.00, 39500.00, 4);

		System.out
				.println("                             *************** 8/1/2012 First Monthly Report ***************");

		System.out.println();
		report(SQL_COUNT);

		System.out.println();
		report(SQL_FORD_CARS);

		System.out.println();
		report(SQL_TRUCKS);

		System.out.println();
		report(SQL_SALES);

		System.out.println();
		report(SQL_PROFIT);

		System.out.println("\nData Dump of all vehicles\n");
		report(SQL_STATEMENT);

		System.out.println("\nInventory sorted by vechicle sold price\n");
		report(SQL_STATEMENT_PRICE);

	}

}
