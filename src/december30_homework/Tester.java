package december30_homework;

public class Tester extends Employee {
	/*
	 * Create Tester class, make it subclass of Employee. Tester IS A Employee name,
	 * age, gender, hourlyRate, jobTitle, ID create default and parameterized
	 * Constructor and make following method available. eat(), sleep(), work(),
	 * testing(),...
	 */
	public Tester() {
	}

	public Tester(String name, int age, char gender, double hourlyRate, String jobTitle, int ID) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.hourlyRate = hourlyRate;
		this.jobTitle = jobTitle;
		this.ID = ID;

	}

	public void testing() {
		System.out.println(name + " is testing!");
	}

}
