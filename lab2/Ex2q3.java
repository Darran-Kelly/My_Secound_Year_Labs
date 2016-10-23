

public class Ex2q3
{
	public static void main(String args[])
	{
		int userInput = 0;
		String stars = " ";
		int index;
		int secoundIndex;
		
		while (userInput != -1)
		{
			System.out.print("Enter an integer: "); // getting the value from the user
			userInput = Keyboard.readInt();
			System.out.println("Number of stars " + userInput);
			for(index = userInput; index >= 0; index--)
			{
				for(secoundIndex = 0; secoundIndex <= userInput; secoundIndex++)
				{
					stars = stars + "*";
					
				}
				
				System.out.println(stars);
				stars = " ";
				userInput = userInput - 1;
			}	
			
		}
		
	}
}