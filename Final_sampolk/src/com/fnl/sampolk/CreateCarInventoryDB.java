package com.fnl.sampolk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateCarInventoryDB {

	public static final String DERBY_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	public static final String JDBC_DERBYURL = "jdbc:derby:inventory;create=true";
	public static final String SQL_STATEMENT = "SELECT * from inventory";

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		Class.forName(DERBY_DRIVER);
		Connection connection = DriverManager.getConnection(JDBC_DERBYURL);
		connection
				.createStatement()
				.execute(
						"create table inventory(inventory_id int, type varchar(25), make varchar(25), model varchar(25), vehicle_year int, "
								+ "start_date date, sold_date date, dealer_cost double, sold_price double, doors_or_wheels int)");

		System.out
				.println("Database has been created with the following fields");
		connection = DriverManager
				.getConnection(CreateCarInventoryDB.JDBC_DERBYURL);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(SQL_STATEMENT);
		ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
		int columnCount = resultSetMetaData.getColumnCount();
		for (int x = 1; x <= columnCount; x++)
			System.out.format("%8s, ", resultSetMetaData.getColumnName(x));
		while (resultSet.next()) {
			for (int x = 1; x <= columnCount; x++)
				System.out.format("%8s", resultSet.getString(x));
		}

	}

}