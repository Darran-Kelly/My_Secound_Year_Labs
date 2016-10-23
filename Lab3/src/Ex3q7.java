//import java.io.*;
/*PATH=%PATH%;C:\Program Files\Java\jdk1.8.0_05\bin
**javac Hello.java
**java –classpath c:\OOP\lab1\Loops
**java –classpath . Hello
*/	 
/*
** Author:	Darran Kelly
** Date:	20-10-2015
** Purpose: find the char entered and print the index position to screen	
*/
class Ex3q7
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
	public static String searchChar(String userInput1, char userInput2) // find the index position of the char
	{
		int	index;
		String charPosition;
		
		charPosition = " ";
		
		for(index = 0; index < userInput1.length()-1; index ++)
		{
			if(userInput1.charAt(index) == userInput2)
			{
				charPosition += index + ",";
			}
		}
		
		return charPosition;
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
		
		System.out.println("Character " +  "'" + userInput2 + "'" + " is at position " + searchChar(userInput1,userInput2) + " in the input string");
		System.out.println("Character " +  "'" + userInput2 + "'" + " occurs " + search(userInput1,userInput2) + " in the string "  + userInput1);
	}
}