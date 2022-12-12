package com.sam.polk.stpwtch;

public class StpWtch_Main {

	public static void main(String args[]) {

		StpWtch_Model m = new StpWtch_Model();
		StpWtch_View v = new StpWtch_View();
		StpWtch_Controller c = new StpWtch_Controller(v, m);

	}

}
