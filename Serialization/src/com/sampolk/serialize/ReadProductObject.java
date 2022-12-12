package com.sampolk.serialize;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadProductObject  {
	private static ObjectInputStream productInput;

	/*public static void main(String[] args) {
		openFile();
		readRecords();
		closeFile();
	}*/

	      static void openFile() {
		try {
			productInput = new ObjectInputStream(Files.newInputStream(Paths
					.get("products.ser")));
		} catch (IOException ioException) {
			System.err.println("Error opening file...");
			System.exit(1); // program terminating...
		}
	}

	      static void readRecords() {
		 System.out.printf("%-6s%-20s%-20s%-15s\n", "ID", "Description",
				"Manufacture", "price");
		try {
			while (true) {
				Product productRecord = (Product) productInput.readObject();
				System.out.printf("%-10d%-18s%-18s%-15.2f\n",productRecord.getProductID(),
					productRecord.getDescription(), productRecord.getManufacture(),
					productRecord.getPricce());
			}
		} catch (EOFException e) {
			System.out.printf("\n\nNo more records..");
		} catch (ClassNotFoundException e) {
			System.err.println("Invalid product object...");
		} catch (IOException e) {
			System.err
					.println("Error reading from file, program terminating...");
		}
	}

        static void closeFile() {
		try {
			if (productInput != null)
				productInput.close();
		} catch (IOException e) {
			System.err.println("Error in closing file, program terminating...");
		}
	}

		
}