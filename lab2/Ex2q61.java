


/*PATH=%PATH%;C:\Program Files\Java\jdk1.7.0_79\bin
**javac Hello.java
**java –classpath c:\OOP\lab1\Loops
**java –classpath . Hello
*/	 
/*
** Author:	Darran Kelly
** Date:	15-10-2015
** Purpose:	multiply	
*/
class Ex2q61
{
	public static void main(String args[])
	{
		int userInput, index, answer;
		final int twelve;
		
		twelve = 12;
		
		System.out.print("Enter number to be multiplied: ");
		userInput = Keyboard.readInt();
		
		for(index = 1; index <= twelve ; index ++)
			{
				System.out.println(userInput + " * "  + index  + " = " + (userInput * index));
			}
			
	}
}	