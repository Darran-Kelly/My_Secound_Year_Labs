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
class Ex3q5
{
	public static int power(int userInput1, int userInput2)
	{
		int output;
		output = 0;

		output = (int)Math.pow(userInput1, userInput2);
		
		return output;
		
	}
		public static void main(String args[])
	{
		int userInput1, userInput2;
		
		System.out.print("Enter interger Value one.: ");
		userInput1 = Keyboard.readInt();
		System.out.print("Enter interger Value two.: ");
		userInput2 = Keyboard.readInt();
		System.out.println(power(userInput1, userInput2));
	}
}