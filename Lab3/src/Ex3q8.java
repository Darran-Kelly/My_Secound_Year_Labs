/*
** Author:	Darran Kelly
** Date:	03-11-2015
** Purpose:	find out if the intergers are divisble by each other 
*/
class Ex3q8
{
	public static boolean evenlyDivisible(int userInput1, int userInput2)
	{
		
		boolean divisible;
		
		if(userInput1 % userInput2 == 0)
		{
			divisible = true;
		}
		else
		{
			divisible = false;
		}
		
		return divisible;
		
	}
	
	public static void main(String args[])
	{
		int userInput1, userInput2;
		
		System.out.print("Enter interger one: ");
		userInput1 = Keyboard.readInt();
		System.out.print("Enter interger two: ");
		userInput2 = Keyboard.readInt();
		
		System.out.print(evenlyDivisible(userInput1, userInput2));
		
	}
}