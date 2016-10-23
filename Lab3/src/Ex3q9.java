/*
** Author:	Darran Kelly
** Date:	03-11-2015
*/
class Ex3q9
{
	public static String multiConcat (String userInput1, int userInput2) // setting the vaible for the method
	{
		int index;
		String concat;
		
		concat = " ";
		 
		 for(index=0;index <userInput2;index++)
		 {
			 concat += userInput1; // join the words together
		 }
		 return concat;
	}
	
	public static void main(String args[])
	{
		String userInput1;
		int userInput2;
		
		System.out.print("Enter word here: ");
		userInput1 = Keyboard.readLine();
		System.out.print("Enter interger here: ");
		userInput2 = Keyboard.readInt();
		
		System.out.print(multiConcat(userInput1, userInput2));
		
	}
}