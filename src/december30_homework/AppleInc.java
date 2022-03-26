package december30_homework;

public class AppleInc {

	public static void main(String[] args) {
		/*
		 * Create AppleInc to test your multilevel inheritance AppleInc HAS A Tester
		 * Apple HAS A Developer
		 * 
		 * 
		 */
		Tester emp1 = new Tester("Chris", 35, 'M', 80, "SDET", 10888);

		System.out.println(emp1.toString());

		emp1.eat();
		emp1.sleep();
		emp1.work();
		emp1.testing();

		Developer emp2 = new Developer("Judy", 28, 'F', 45, "market R&D", 10880);

		System.out.println("\n" + emp2.toString());
		emp2.eat();
		emp2.sleep();
		emp2.work();
		emp2.code();
	}

}
