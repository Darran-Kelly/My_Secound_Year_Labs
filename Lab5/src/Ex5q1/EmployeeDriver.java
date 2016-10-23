package Ex5q1;

import Ex5q1.employeeArray;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		int index;
		
		employeeArray darren = new employeeArray();
		for(index = 0; index < darren.length; index ++)
		{
			
			System.out.println(darren.employee[index].toString());
		}
		
		
		
		
		
		//System.out.print(darren.toString());

	}

}
