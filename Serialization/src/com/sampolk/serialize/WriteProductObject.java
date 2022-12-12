package com.sampolk.serialize;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WriteProductObject {
	private static ObjectOutputStream productOutput;
	private static Scanner sc;
	private static int pid;
	private static String desc;
	private static String mnfc;
	private static double prc;

	/*public static void main(String[] args) {
		openFile();
		addRecords();
		closeFile();
		sc.close();
	}*/

        static void openFile() {
		try {
			productOutput = new ObjectOutputStream(Files.newOutputStream(Paths
					.get("Products.ser")));
		} catch (IOException ioException) {
			System.err.println("Error opening file...");
			System.exit(1); // program terminating...
		}
	}

	    static void addRecords() {
		sc = new Scanner(System.in);
		System.out
				.println("Enter Product id, description, manufacture and price - all zeros to quit");
		while (sc.hasNext()) {
			try {
				pid = sc.nextInt();
				desc = sc.next();
				mnfc = sc.next();
				prc = sc.nextDouble();
				if (pid == 0) break;
				 Product productRecord = new Product(pid, desc, mnfc, prc);
			  productOutput.writeObject(productRecord);
			} catch (NoSuchElementException e) {
				System.err.println("Invalid data, please re-enter...");
				sc.nextLine(); // discarding user input data...
			} catch (IOException e) {
				System.err
						.println("Error writing Product object, program terminating...");
				break;
			}
			
			System.out.println("? ");
		}
	}

	    static void closeFile() {
		try {
			if (productOutput != null)
				productOutput.close();
		} catch (IOException e) {
			System.err.println("Error in closing file, program terminatin...");
		}
	}

		
}