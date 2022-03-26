package december30_homework;

public class Person {
	/*
	 * Multilevel Inheritance in Java
	 * 
	 * Person name, age, gender setInfo, eat(), sleep()
	 */

	String name;
	int age;
	char gender;

	public Person() {
	}

	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void setInfor(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void eat() {
		System.out.println(name + " is eatting!");
	}

	public void sleep() {
		System.out.println(name + " is sleeping!");
	}

	public String toString() {
		return "name: " + name + " age: " + age + " gender: " + gender + ".";
	}

}
