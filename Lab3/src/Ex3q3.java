//import java.io.*;
/*PATH=%PATH%;C:\Program Files\Java\jdk1.8.0_05\bin
**javac Hello.java
**java –classpath c:\OOP\lab1\Loops
**java –classpath . Hello
*/	 
/*
** Author:	Darran Kelly
** Date:	20-10-2015
** Purpose:	keep adding the next number to the total until it reach the number hundred then stops
*/
class Ex3q3
{
	public static int sum100()
	{
		int  number, output;
		output = 0;
		number = 0;
		for(number = 0; number <= 100; number ++)
		{
			output = output + number;
		}
		return output;
		
	}
		public static void main(String args[])
	{
		System.out.println(sum100());
	}
}