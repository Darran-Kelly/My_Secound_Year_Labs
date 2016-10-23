

public class Ex2q1
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
			for(index = userInput; index == userInput; index++)
			{
				for(secoundIndex = 0; secoundIndex <= userInput; secoundIndex++)
				{
					stars = stars + "*";
					
				}
				
				System.out.println("number of stars.: " + userInput);
				System.out.println(stars);
				stars = " ";
			}	
			
		}
		
	}
}