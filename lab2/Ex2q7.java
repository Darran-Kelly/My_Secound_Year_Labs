
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
class Ex2q7
{
		public static void main(String args[])
	{
		int count, userInput;
		
		userInput = 0;
		count = 0;
		
		
		while(userInput != -1)
		{
			double randomVarible1 = (Math.random() * 13);
			double randomVarible2 = (Math.random() * 13);
			System.out.print("How much is " + (int)randomVarible1 + " times " + (int)randomVarible2 + "? " + " (-1 to quit): ");
			userInput = Keyboard.readInt();
			while(userInput != (int)randomVarible1 * (int)randomVarible2 && userInput != -1)
			{
				if(userInput == (int)randomVarible1 * (int)randomVarible2) 
				{
					System.out.println("Very Good.");
				}
				else if(userInput != (int)randomVarible1 * (int)randomVarible2 && userInput != -1)
				{
						System.out.println("No please try again.");
				}
				else 
					{
						System.out.println("Goodbye");
					}
				count ++;
			}
		}
		
	}
}