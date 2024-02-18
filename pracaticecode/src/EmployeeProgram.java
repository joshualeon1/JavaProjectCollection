public class EmployeeProgram {
	
	//data variables LAST NAME,FIRST NAME,JOB TITLE,DEPARTMENT,EMPLOYEE ANNUAL SALARY
	private String lastName;
	private String firstName;
	private String jobTitle;
	private String department;
	private double annualSalary;
	
	public EmployeeProgram(String lastName, String firstName, String jobTitle, String department, double annualSalary) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.jobTitle = jobTitle;
		this.department = department;
		this.annualSalary = annualSalary;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public String getDepartment() {
		return department;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	@Override
	public String toString() {
		return "Employee lastName: " + lastName + " | firstName: " + firstName + " | jobTitle: " + jobTitle + " | department: " + department + " | annualSalary: " + annualSalary;
	}
	
}//end class
