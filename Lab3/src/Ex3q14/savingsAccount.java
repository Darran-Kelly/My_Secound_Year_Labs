package Ex3q14;

/*
** Author:	Darran Kelly
** Date:	24-11-2015
** Purpose: 	
*/
public class savingsAccount
{
	public static void main(String args[])
	{
		SavingAccount customer1 = new SavingAccount(); //creating two new objects for the savingAccount class
		SavingAccount customer2 = new SavingAccount();
		
		double balance;
		
		System.out.print("Enter new Balance for customer one");  // enter the new balance for the customer
		balance = Keyboard.readDouble();
		customer1.setBalance(balance); // sending the value to the setter method for balance
		System.out.println("Enter new Balance for customer one");
		balance = Keyboard.readDouble();
		customer2.setBalance(balance);
		// displaying the new balance to screen
		System.out.println("the new balance for customer one is" + customer1.getCustumerId() + customer1.calculateMonthlyInterest()); 
		System.out.println("the new balance for customer one is" + customer2.getCustumerId() + customer2.calculateMonthlyInterest());
		
		customer1.modifyInterestRate();
		customer2.modifyInterestRate();
		
		// displaying to screen the new balance after the interest rate is calculated
		
		System.out.println("the new balance for customer one is" + customer1.getCustumerId() + customer1.calculateMonthlyInterest()); 
		System.out.println("the new balance for customer one is" + customer2.getCustumerId() + customer2.calculateMonthlyInterest());
		
		
		
		
	}
}

