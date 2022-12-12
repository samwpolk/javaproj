
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WriteEmployeeObject {
	private static ObjectOutputStream employeeOutput;
	private static Scanner sc;
	public static void main(String[] args) {
		openFile();
		addRecords();
		closeFile();
		sc.close();
	}

	private static void openFile() {
		try {
			employeeOutput =
					new ObjectOutputStream(Files.
							newOutputStream(Paths.get("employees.ser")));
		}
		catch (IOException ioException){
			System.err.println("Error opening file...");
			System.exit(1); // program terminating...
		}
	}
	private static void addRecords() {
		sc = new Scanner(System.in);
		System.out.
		println("Enter product id, decription, manufature and price:");
		
	
		while (sc.hasNext()) {
			try {
				Product ProductRecord = new Product();
				//employeeOutput.writeObject(employeeRecord);
			}
			catch (NoSuchElementException e) {
				System.err.println("Invalid data, please re-enter...");
				sc.nextLine(); // discarding user input data...
			}
			catch (IOException e) {
				System.err.
				println("Error writing employee object, program terminating...");
				break;
			}
			System.out.println("?");
		}
	}
	private static void closeFile() {
		try {
			if (employeeOutput != null)
				employeeOutput.close();
		}
		catch (IOException e) {
			System.err.println("Error in closing file, program terminatin...");
		}
	}
}