public class Ex1q9
{
	public static void main(String args[])
	{
		    int largest = 0;
			int index = 0;
			int userInput;
			
			while(index <= 10)
				{
					System.out.println("Enter number " + index);
					userInput = Keyboard.readInt();
					
					if(largest <= userInput)
						{
							largest = userInput;
						}
						index++;
				}
			
			System.out.print("The largest numeber is " + largest);
	}
}