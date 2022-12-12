package com.sampolk.emp;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		

		Employee[] employees = {

				new SalariedEmployee("EID1", "Smith", "Sam", "1/2/2007", "",
						"W2S", 40, (1800 / 40.0), 0, 0.0),

				new SalariedEmployee("EID2", "Gonzalez", "Jose", "3/14/2003",
						"", "W2S", 40, 2300 / 40, 0, 0.0),

				new HourlyEmployee("EID3", "Jones", "Jill", " 1/22/2011", "",
						"W2H", 48, 16.45, 0, 0.0),

				new CommissionEmployee("EID4", "Hill", "James", "7/5/2008", "",
						"W2C", 2300.0, .045, 1500.0, 0.0),

				new SalariedEmployee("EID5", "Smith", "Joan", "3/12/2008", "",
						"W2S", 40, 1750 / 40.0, 0, 0.0),

				new Consultant("CID1", "Cuervo", "Margarita", "01/13/2014",
						"1/17/2014", "1099", 3400, 0, 0, 0.0),

				new Consultant("CID2", "Smith", "John", "12/16/2013",
						"1/15/2014", "1099", 19800.0, 0, 0, 0.0),

				new HourlyEmployee("EID6", "Patel", "Are", "5/5/2009", "",
						"W2H", 51, 14.56, 0, 0.0),

				new HourlyEmployee("EID7", "Chen", "Susan", "3/1/2003", "",
						"W2H", 46, 25.43, 0, 0.0),

				new Consultant("CID3", "Murdoch", "Rupert", "10/03/2013",
						"02/18/2014", "1099", 3400, 0, 0, 0.0),

				new CommissionEmployee("EID8", "Sanchez", "Donna",
						"11/15/2004", "", "W2C", 34000, .052, 1700.0, 0.0)

		};

		/*
		 * List<Employee> list = Arrays.asList(employees); for (Employee p :
		 * employees) { System.out.println(p);
		 * 
		 * }
		 * 
		 * System.out.println(); System.out.println(); Arrays.sort(employees);
		 */

		Arrays.sort(employees, Employee.EmployeeNameComparator);
		System.out.println("All Employees and Consultants");
		for (Employee p : employees) {
			System.out.println(p);

		}
		Employee.summary(employees, "W2 Employees ", "W2");
		Employee.summary(employees, "1099 Consultants", "1099");
		Employee.summary(employees, "Salary Employees", "W2S");
		Employee.summary(employees, "Hourly Employees", "W2H");
		Employee.summary(employees, "Commison Employees", "W2C");

		for (Employee p : employees) {
			p.setEarn(p.pay());
		}

		Arrays.sort(employees, Employee.EmployeeNameComparator1);

	
		double pAvg = 0;
		double pAvgC = 0;
		int cnt = 0;
		int cntC = 0;
		System.out.println("\n");
		for (Employee p : employees) {
			// System.out.println(p.getEmpID()+"  "+p.getName()+" "+p.getdHired()+" "+p.getTermDate()+" "+p.pay());
			System.out.println(p);
			if (p.getEmplType().startsWith("W2")) {
				pAvg += p.pay();
				cnt++;
			} else {
				pAvgC += p.pay();
				cntC++;
			}
	
		}

		System.out.println("The Avergare Earning for a  W2 employee is " + pAvg
				/ cnt);
		System.out.println("The Avergare Earning for a 1099  employee is "
				+ pAvgC / cntC);

	}

}
