package com.sampolk.emp;

public class Consultant extends Employee {

	public Consultant(String empID, String lName, String fName, String dHired,
			String termDate, String emplType, double hrsWrkd, double rate,
			double gross, Double earn) {
		super(empID, lName, fName, dHired, termDate, emplType, hrsWrkd, rate,
				gross, earn);

	}

	
	@Override
	public double pay() {

		/*
		 * SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		 * 
		 * Date endDate = null; Date trmDate = null; Date srtDate = null; long
		 * diff = 0; long diff1 = 0; try { endDate =
		 * formatter.parse("01/17/2014"); trmDate =
		 * formatter.parse(getTermDate()); srtDate =
		 * formatter.parse(getdHired()); long conv = (24*60*60*1000);
		 * 
		 * diff = (trmDate.getTime() - endDate.getTime())/conv; diff1 =
		 * (endDate.getTime() - srtDate.getTime())/conv;
		 * 
		 * if (diff > 0) System.out.println(getName() +
		 * " has "+diff+" more days at " + getDpv3()/diff1 +" dollars a day");
		 * 
		 * } catch (ParseException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * 
		 * 
		 * //System.out.println(getdHired());
		 * //System.out.println(getTermDate()); //if (diff > 0)
		 * System.out.println(getName() + " has "+diff+" more days at " +
		 * getDpv3()/diff1 +" dollars a day");
		 */
		return getDpv3();
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
