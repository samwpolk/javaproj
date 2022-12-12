package db;

import java.sql.Connection;	
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateEmployeeDB {
	public static final String DERBY_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	public static final String JDBC_DERBYURL = "jdbc:derby:employees;create=true";

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		Class.forName(DERBY_DRIVER);
		Connection connection = DriverManager.getConnection(JDBC_DERBYURL);
		connection
				.createStatement()
				.execute(
						"create table employees(empid int, lastname varchar(25), "
								+ "firstname varchar(25), phone varchar(15), email varchar(25))");
		connection
				.createStatement()
				.execute(
						"insert into employees values "
								+ "(1, 'Gonzales', 'Jorge', '(123) 456-7890', 'jorge@greatco.com'), "
								+ "(2, 'Chung', 'Carol', '(234) 123-4567', 'carol@acompany.com'), "
								+ "(3, 'Smith', 'Howard', '(334) 567-5543', 'smith@ajax.com')");
		System.out.println("employees table created and records inserted...");
	}
}