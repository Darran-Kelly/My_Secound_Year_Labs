//import java.io.*;
/*PATH=%PATH%;C:\Program Files\Java\jdk1.8.0_05\bin
**javac Hello.java
**java –classpath c:\OOP\lab1\Loops
**java –classpath . Hello
*/	 
/*
** Author:	Darran Kelly
** Date:	20-10-2015
** Purpose:	multiply	
*/
class Ex3q4
{
	public static double fahToCel()
	{
		int userInput;
		double output;
		output = 0;
		userInput = 0;
		
		System.out.print("Enter Fahrenheit Value to be converted");
		userInput = Keyboard.readInt();
		output = (userInput  -  32)  *  5/9;
		
		return output;
		
	}
		public static void main(String args[])
	{
		System.out.println(fahToCel());
	}
}