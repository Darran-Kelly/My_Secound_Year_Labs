//import java.io.*;
/*PATH=%PATH%;C:\Program Files\Java\jdk1.8.0_05\bin
**javac Hello.java
**java –classpath c:\OOP\lab1\Loops
**java –classpath . Hello
*/	 
/*
** Author:	Darran Kelly
** Date:	20-10-2015
** Purpose:	print out how many time a char apears in the string 	
*/
class Ex3q6
{
	public static int search(String userInput1, char userInput2)
	{
		int output, index;
		output = 0;
		
		for(index = 0; index <= userInput1.length()-1; index ++)
		{
			if(userInput1.charAt(index) == userInput2)
			{
				output ++;
			}
		}
		
		return output;
		
	}
		public static void main(String args[])
	{
		String userInput1;
		char userInput2;
		
		userInput1 = " ";
		
		System.out.print("Enter your sentence here.: ");
		userInput1 = Keyboard.readLine();
		System.out.print("Enter character to search for.: ");
		userInput2 = Keyboard.readChar();
		System.out.println(search(userInput1, userInput2));
	}
}