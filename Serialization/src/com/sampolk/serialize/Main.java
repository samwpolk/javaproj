package com.sampolk.serialize;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		WriteProductObject.openFile();
		WriteProductObject.addRecords();
		WriteProductObject.closeFile();
		
	
		ReadProductObject.openFile();
		ReadProductObject.readRecords();
		ReadProductObject.closeFile();
		
		
	}

}
