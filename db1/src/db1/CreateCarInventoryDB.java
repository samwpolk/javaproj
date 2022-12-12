package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateCarInventoryDB {

	public static final String DERBY_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	public static final String JDBC_DERBYURL = "jdbc:derby:inventory;create=true";

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		Class.forName(DERBY_DRIVER);
		Connection connection = DriverManager.getConnection(JDBC_DERBYURL);
		connection
	    .createStatement()
		.execute("create table inventory(inventory_id int, type varchar(25), make varchar(25), model varchar(25), car_year int, "
		                                  +"start_date date, sold_date date, dealer_cost double, sold_price double, door int, wheels int)");
		
		connection
		        .createStatement()
		        .execute("insert into inventory values"
		         + "(1, 'Car','Ford','Crown Victoria',2010,'7/3/2010','7/23/2012',8900.00,14000.00,4,4),"
				 + "(2, 'Car','Ford','Cornw Victoria',2010,'7/3/2010','7/23/2012',8900.00,14000.00,4,4)");
						
						
		System.out.println("inventory table created and records inserted...");
	}
}
