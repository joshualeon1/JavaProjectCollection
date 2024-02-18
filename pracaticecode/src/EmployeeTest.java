import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {

		//an array to hold our objects
		EmployeeProgram[] employeeProgram = new EmployeeProgram[34218];

		File file = new File("EmployeeData.csv");
		Scanner input = null;
		
		//Exception Handling
		try {
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			e.printStackTrace();
		}//end catch

		//to read in the header of the text file
		input.nextLine();

		int index = 0;
		while(input.hasNext()) {

			//MC CARTHY, GARRY F,SUPERINTENDENT OF POLICE,POLICE,260004
			String line = input.nextLine();//each line in the file is read in as a single String segment here
			String[] fields = line.split(",");//the string segment is then 'split' at every ',' char (see .cvs file)
			employeeProgram[index++] = new EmployeeProgram(fields[0], fields[1].trim(), fields[2], fields[3], Double.parseDouble(fields[4]));//the '.trim()' is used to remove extra whitespace before/after a String

		}//end while

		input.close();

		System.out.println(findEmployee(employeeProgram, "Brian S", "Murphy"));//this prints out the info we're looking for using the '.toString' method from the parent class without having to call upon it somehow
		System.out.println(findEmployee(employeeProgram, "Eric D", "Clark"));
		System.out.println(findEmployee(employeeProgram, "Lisa M", "Hall"));
		System.out.println(findEmployee(employeeProgram, "Pedro", "Adame"));

		System.out.println("\nLowest Paid Employee Salary: " + findLowestPaidEmployeeSalary(employeeProgram, "POLICE"));
		System.out.println("\nLowest Paid Employee:\n" + findLowestPaidEmployee(employeeProgram, "POLICE"));
		System.out.println("\nTop Employee that made the most money:\n" + findHighestPaidEmployee(employeeProgram, "POLICE"));

		DecimalFormat df = new DecimalFormat(".##");
		System.out.println("\nThe average pay for all employess that workin in the police department: " + df.format(findAverageEmployeeSalary(employeeProgram, "POLICE")));

	}//end main

	public static EmployeeProgram findEmployee(EmployeeProgram[] employeeProgram, String firstName, String lastName) {

		for(int i = 0; i < employeeProgram.length; i++) {
			String fName = employeeProgram[i].getFirstName();
			String lName = employeeProgram[i].getLastName();
			if(fName.equalsIgnoreCase(firstName) && lName.equalsIgnoreCase(lastName))
				return employeeProgram[i];
		}
		return null;
	}//end findEmployee

	public static double findLowestPaidEmployeeSalary (EmployeeProgram[] employeeProgram, String department) {
		double min = employeeProgram[0].getAnnualSalary();
		for(int i = 0; i < employeeProgram.length; i++) {
			String dept = employeeProgram[i].getDepartment();
			if(dept.equalsIgnoreCase(department)) {
				double salary = employeeProgram[i].getAnnualSalary();
				if(salary < min)
					min = salary;
			}
		}
		return min;
	}//end findLowestPaidEmployeeSalary

	public static EmployeeProgram findLowestPaidEmployee (EmployeeProgram[] employeeProgram, String department) {
		double min = employeeProgram[0].getAnnualSalary();
		EmployeeProgram empMin = employeeProgram[0];

		for(int i = 0; i < employeeProgram.length; i++) {
			String dept = employeeProgram[i].getDepartment();
			if(dept.equalsIgnoreCase(department)) {
				double salary = employeeProgram[i].getAnnualSalary();
				if(salary < min) {
					min = salary;
					empMin = employeeProgram[i];
				}
			}
		}
		return empMin;
	}//end findLowestPaidEmployee

	public static EmployeeProgram findHighestPaidEmployee (EmployeeProgram[] employeeProgram, String department) {
		double max = employeeProgram[0].getAnnualSalary();
		EmployeeProgram empMax = employeeProgram[0];

		for(int i = 0; i < employeeProgram.length; i++) {
			String dept = employeeProgram[i].getDepartment();
			if(dept.equalsIgnoreCase(department)) {
				double salary = employeeProgram[i].getAnnualSalary();
				if(salary > max) {
					max = salary;
					empMax = employeeProgram[i];
				}
			}
		}
		return empMax;
	}//end findHighestPaidEmployee

	public static double findAverageEmployeeSalary (EmployeeProgram[] employeeProgram, String department) {
		double sum = 0;
		double count = 0;
		for(int i = 0; i < employeeProgram.length; i++) {
			String dept = employeeProgram[i].getDepartment();
			if(dept.equalsIgnoreCase(department)) {
				double salary = employeeProgram[i].getAnnualSalary();
				sum += salary;
				count++;
			}
		}
		return sum/count;
	}//end findAverageEmployeeSalary

}//end class
