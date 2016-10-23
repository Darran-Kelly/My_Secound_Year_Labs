/*
** Author:	Darran Kelly
** Date:	03-11-2015
*/
class Ex3q10
{
	public static int factorial(int userInput)
	{
		int result, index;
		result = 1;
		
		for(index = 1; index <= userInput; index++)
		{
			result = result * index; 
		}
		
		return result;
	}
	
	public static void main(String args[])
	{
		int userInput;
		
		System.out.print("Enter interger here: ");
		userInput = Keyboard.readInt();
		
		System.out.print(factorial(userInput));
		
	}
}