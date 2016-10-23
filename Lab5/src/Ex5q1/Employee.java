package Ex5q1;

public class Employee {
	//public static final char[] toString = null;
	private int number;
	private String name;
	private String  address; 
	private String department;
	private int salery;
	private int regNumber;
	public Employee(){
		this.number = number;
		this.name = name;
		this.address = address;
		this.department = department;
		this.salery = salery;
		this.regNumber = regNumber;
		
	}
	
	public Employee(String name, int salery)
	{
		this.number = 0;
		this.name = name;
		this.address = null;
		this.department = null;
		this.salery = salery;
		this.regNumber = 0;
		
	}
	public Employee(String name, String department, int salery)
	{
		
		
		this.name = name;
		this.department = department;
		this.salery = salery;

		
	}
	
	
	



	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSalery() {
		return salery;
	}

	public void setSalery(int salery) {
		this.salery = salery;
	}

	public int getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public int taxPayable(){
		if(salery <= 20000){
			salery = (salery / 20);
		}
		else{
			salery = (salery / 40);
		}
		return salery;
			
		
	}






	@Override
	public String toString() {
		return "Employee [number=" + number + ", salery=" + salery
				+ ", regNumber=" + regNumber + ", name=" + name + ", address="
				+ address + ", department=" + department + "]";
	}
}
