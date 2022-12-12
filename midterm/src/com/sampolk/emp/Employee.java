package com.sampolk.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;


public abstract class Employee implements Comparable<Employee> {

	private String empID;
	private String lName;
	private String fName;
	private String dHired;
	private String termDate;
	private String emplType;
	private double dpv1;
	private double dpv2;
	private double dpv3;
	private Double earn;

	public Employee(String empID, String lName, String fName, String dHired,
			String termDate, String emplType, double dpv3, double dpv1,
			double dpv2, Double earn) {

		this.empID = empID;
		this.lName = lName;
		this.fName = fName;
		this.dHired = dHired;
		this.termDate = termDate;
		this.emplType = emplType;
		this.dpv1 = dpv1;
		this.dpv2 = dpv2;
		this.dpv3 = dpv3;
		this.earn = earn;

	}

	public int compareTo(Employee compareEmployee) {

		int compareQuantity = (int) ((Employee) compareEmployee).getDpv3();

		// ascending order
		return (int) this.getDpv3() - compareQuantity;

	}

	public static Comparator<Employee> EmployeeNameComparator = new Comparator<Employee>() {

		public int compare(Employee emp1, Employee emp2) {

			String EmployeeName1 = emp1.getlName();
			String EmployeeName2 = emp2.getlName();
			// ascending order
			return EmployeeName1.compareTo(EmployeeName2);

		}

	};

	public static Comparator<Employee> EmployeeNameComparator1 = new Comparator<Employee>() {

		public int compare(Employee emp1a, Employee emp2a) {

			Double EmployeeEarn1 = emp1a.getEarn();
			Double EmployeeEarn2 = emp2a.getEarn();

			return EmployeeEarn2.compareTo(EmployeeEarn1);

		}

	};

	public static void summary(Employee[] emp, String title, String type) {

		System.out.println("\n" + title);
		int ii = 0;
		int tempx = -100;
		int tempn = -100;
		int total = 0;
		double max = -9999;
		double min = 99999;

		// List<Employee> list = Arrays.asList(emp);

		for (Employee p : emp) {
			if (p.getEmplType().startsWith(type)) {
				total += p.pay();
				if (Math.max(max, p.pay()) != max)
					tempx = ii;
				max = Math.max(max, p.pay());

				if (Math.min(min, p.pay()) != min)
					tempn = ii;
				min = Math.min(min, p.pay());

				// System.out.println(p+" "+p.pay());
				if (p.getEmplType().startsWith("W2"))
					System.out.println(p.getEmpID() + "  " + p.getName() + " "
							+ p.pay());
				else
					System.out.println(p.getEmpID() + "  " + p.getName() + " "
							+ p.getdHired() + " " + p.getTermDate() + " "
							+ p.pay());

				if (p.getEmplType().startsWith("1099")) {

					SimpleDateFormat formatter = new SimpleDateFormat(
							"MM/dd/yyyy");

					Date endDate = null;
					Date trmDate = null;
					Date srtDate = null;
					long diff = 0;
					long diff1 = 0;
					try {
						endDate = formatter.parse("01/17/2014");
						trmDate = formatter.parse(p.getTermDate());
						srtDate = formatter.parse(p.getdHired());
						long conv = (24 * 60 * 60 * 1000);

						diff = (trmDate.getTime() - endDate.getTime()) / conv;
						diff1 = (endDate.getTime() - srtDate.getTime()) / conv;

						if (diff > 0)
							System.out.println(p.getName() + " has  " + diff
									+ " more days on the current conttact at "
									+ p.getDpv3() / diff1 + " dollars a day");

					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

			ii++;

		}

		System.out.println("\n\n Least Paid "
				+ (title.subSequence(0, title.length() - 1)) + " "
				+ emp[tempn].getEmpID() + " " + emp[tempn].getName() + " "
				+ emp[tempn].pay());
		System.out.println(" Most Paid "
				+ (title.subSequence(0, title.length() - 1)) + " "
				+ emp[tempx].getEmpID() + "  " + emp[tempx].getName() + " "
				+ emp[tempx].pay());
		// System.out.println("\n\n max "+emp[tempx]+" "+emp[tempx].pay());

		System.out.println();
		System.out.println("Total money paid for " + title + ":: " + total);

	}

	public String getEmpID() {
		return empID;
	}

	public String getlName() {
		return lName;
	}

	public String getfName() {
		return fName;
	}

	public String getdHired() {
		return dHired;
	}

	public String getTermDate() {
		return termDate;
	}

	public String getEmplType() {
		return emplType;
	}

	public double getDpv1() {
		return dpv1;
	}

	public double getDpv2() {
		return dpv2;
	}

	public double getDpv3() {
		return dpv3;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public void setdHired(String dHired) {
		this.dHired = dHired;
	}

	public void setTermDate(String termDate) {
		this.termDate = termDate;
	}

	public void setEmplType(String emplType) {
		this.emplType = emplType;
	}

	public void setDpv1(double dpv1) {
		this.dpv1 = dpv1;
	}

	public void setDpv2(double dpv2) {
		this.dpv2 = dpv2;
	}

	public void setDpv3(double dpv3) {
		this.dpv3 = dpv3;
	}

	public String getName() {
		return String.format("%s %s", getfName(), getlName());
	}

	public Double getEarn() {
		return earn;
	}

	public void setEarn(Double earn) {
		this.earn = earn;
	}

	@Override
	public String toString() {
		return empID + ", " + lName + ", " + fName + ", " + dHired + ", "
				+ termDate + ", " + emplType + ", " + dpv1 + ", " + dpv2 + ", "
				+ dpv3 + ", " + earn;
	}

	public abstract double pay();

}
