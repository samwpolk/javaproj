package com.sampolk.emp;

public class CommissionEmployee extends Employee {

	public CommissionEmployee(String empID, String lName, String fName,
			String dHired, String termDate, String emplType, double hrsWrkd,
			double rate, double gross, Double earn) {
		super(empID, lName, fName, dHired, termDate, emplType, hrsWrkd, rate,
				gross, earn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double pay() {

		double rt = getDpv1();
		double gr = getDpv2();
		double bp = getDpv3();

		return (bp + gr * rt);
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
