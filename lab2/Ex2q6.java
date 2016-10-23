
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
class Ex2q6
{
	public static void main(String args[])
	{
		int index, index2;
		
		
		for(index2 = 0; index2 <= 12; index2++)
		{
			for(index = 0; index <= 12 ; index ++)
			{
				System.out.println(index + " * "  + index2 + " = " + (index2 * index));
				
			}
		}
	}
}	