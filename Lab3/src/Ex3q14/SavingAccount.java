package Ex3q14;

class SavingAccount
{
	public int customerId;
	static int counter;
	public double balance;
	public static int interestRate = 4;
	
	public SavingAccount() //constucter method
	{
		counter += 1;
		customerId = counter;
	}
	public int getCustumerId() // getter method 
	{
		return customerId;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double b)
	{
		this.balance = b;
	}
	public double calculateMonthlyInterest()
	{
		double montlyInterest, newTotal;
		
		montlyInterest = ((getBalance() / 100)) * interestRate / 12; // calculateing the balance after interest
		newTotal = montlyInterest + getBalance(); // setting the new total
		setBalance(newTotal); // returning the value to the setter method
		return newTotal;
	}
	public static void modifyInterestRate()
	{
		interestRate = 5;
	}
	
}