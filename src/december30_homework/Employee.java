package december30_homework;

public class Employee extends Person {

	/*
	 * Create Employee class, make it subclass of Person. Employee IS A Person
	 * 
	 * name, age, gender, hourlyRate, jobTitle, ID setInfo, eat(), sleep(), work()
	 */
	double hourlyRate;
	String jobTitle;
	int ID;

	public Employee() {
	}

	public Employee(String name, int age, char gender, double hourlyRate, String jobTitle, int ID) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.hourlyRate = hourlyRate;
		this.jobTitle = jobTitle;
		this.ID = ID;
	}

	public void setInfo(String name, int age, char gender, double hourlyRate, String jobTitle, int ID) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.hourlyRate = hourlyRate;
		this.jobTitle = jobTitle;
		this.ID = ID;

	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String toString() {
		return "name: " + name + " age: " + age + " gender: " + gender + " hourly rate: " + hourlyRate + " job title: "
				+ jobTitle + " ID: " + ID + ".";
	}

	public void work() {
		System.out.println(name + " is working!");
	}

}