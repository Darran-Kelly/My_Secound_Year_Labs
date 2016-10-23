


/*PATH=%PATH%;C:\Program Files\Java\jdk1.7.0_79\bin
**javac Hello.java
**java –classpath c:\OOP\lab1\Loops
**java –classpath . Hello
*/	 
/*
** Author:	Darran Kelly
** Date:	15-10-2015
** Purpose:	Switch	
*/
class Ex2q5
{
	public static void main(String args[])
	{
		int userInput;
		int amount;
		//int quantity;
		double product1, product2, product3, product4, product5, totalAmount;
		int sentenialValue;
		
		sentenialValue = 1;
		totalAmount = 0;
		
		
		/*product1 = 2.98
		product2 = 4.50;
		product3 = 9.98;
		product4 = 4.49;
		product5 = 6.87;*/
		
		while(sentenialValue != 0)
			{
				System.out.println("product1 = 2.98");
				System.out.println("product2 = 4.50");
				System.out.println("product3 = 9.98");
				System.out.println("product4 = 4.49");
				System.out.println("product5 = 6.87");
				System.out.println("Enter product number.: ");
				userInput = Keyboard.readInt();
				System.out.println("Enter product amount.: ");
				amount = Keyboard.readInt();
				
				switch (userInput)
					{
						case 1 : product1 = 2.98;
							if(userInput == 1)
								{
									totalAmount = amount * product1;
								}
						break;
						case 2 : product2 = 4.50;
							if(userInput == 2)
								{
									totalAmount = product2 * amount;
								}
						break;
						case 3 : product3 = 9.98;
							if(userInput == 3)
								{
									totalAmount = amount * product3;
								}
						break;
						case 4 : product4 = 4.49;
							if(userInput == 4)
								{
									totalAmount = amount * product4;
								}
						break;
						case 5 : product5 = 6.87;
							if(userInput == 5)
								{
									totalAmount = amount * product5;
								}
						break;
						default: amount = 0; 
						break;
					}
				System.out.println("The amount owed: " + totalAmount);
				System.out.println("Hit Zero to quit");
				sentenialValue = Keyboard.readInt();
			}
	}   
}	