package com.sampolk.emp;

public class SalariedEmployee extends Employee {

	public SalariedEmployee(String empID, String lName, String fName,
			String dHired, String termDate, String emplType, double hrsWrkd,
			double rate, double gross, Double earn) {
		super(empID, lName, fName, dHired, termDate, emplType, hrsWrkd, rate,
				gross, earn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double pay() {

		double hw = getDpv3();
		double rt = getDpv1();

		return hw % 40 * (1.5 * rt) + (hw - hw % 40) * rt;

	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
