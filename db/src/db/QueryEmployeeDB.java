package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class QueryEmployeeDB {
	public static final String SQL_STATEMENT = "SELECT * from employees";

	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager
				.getConnection(CreateEmployeeDB.JDBC_DERBYURL);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(SQL_STATEMENT);
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
	}
}