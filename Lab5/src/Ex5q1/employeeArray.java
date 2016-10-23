package Ex5q1;


public class employeeArray {
	public Employee[] employee = new Employee[10];
	public int length = employee.length;
	

	public employeeArray() {
		Employee employee1 = new Employee("bob", "sdfghjk", 34567);
		Employee employee2 = new Employee("joe", "sdfghjk", 8765);
		Employee employee3 = new Employee("jim", "sdfghjk", 35678);
		Employee employee4 = new Employee("tom", "sdfghjk", 6432);
		Employee employee5 = new Employee("mick", "sdfghjk", 53435);
		Employee employee6 = new Employee("karl", "sdfghjk", 2312);
		Employee employee7 = new Employee("timmy", "sdfghjk", 23124);
		Employee employee8 = new Employee("heu", "sdfghjk", 753423);
		Employee employee9 = new Employee("tommy", "sdfghjk", 12311);
		Employee employee10 = new Employee("john", "sdfghjk", 45564);
		
		
		
		employee[0] = employee1;
		employee[1] = employee2;
		employee[2] = employee3;
		employee[3] = employee4;
		employee[4] = employee5;
		employee[5] = employee6;
		employee[6] = employee7;
		employee[7] = employee8;
		employee[8] = employee9;
		employee[9] = employee10;
		
		

	}

}
