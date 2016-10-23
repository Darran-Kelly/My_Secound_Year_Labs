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
class Ex3q2
{
	public static void powersOfTwo()
	{
		int two, number, output;
		two = 2;
		number = 0;
		for(number = 2; number <= 10; number ++)
		{
			output = (int) Math.pow(two , number);
			System.out.println(output);
		}
		
	}
		public static void main(String args[])
	{
		powersOfTwo();
	}
}