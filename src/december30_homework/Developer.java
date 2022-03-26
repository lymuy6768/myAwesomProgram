package december30_homework;

public class Developer extends Employee {
	/*
	 * Create Developer class, make it subclass of Employee. Developer IS A Employee
	 * name, age, gender, hourlyRate, jobTitle, ID create default and parameterized
	 * Constructor and make following method available. eat(), sleep(), work(),
	 * code()...
	 */
	public Developer() {
	}

	public Developer(String name, int age, char gender, double hourlyRate, String jobTitle, int ID) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.hourlyRate = hourlyRate;
		this.jobTitle = jobTitle;
		this.ID = ID;
	}

	public void code() {
		System.out.println(name + " is coding!");
	}

}
