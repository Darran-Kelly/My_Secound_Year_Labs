public class Ex1q10
{
	public static void main(String args[])
	{
		int largest = 0;
		int currentNumber;
		int smallest = 0;
		int sentinal = 1;
		
		while(sentinal != 0)
		{
			System.out.println("Enter a number ");
			currentNumber = Keyboard.readInt();
			
			if(smallest == 0 && largest == 0)
			{
				smallest = currentNumber;
			}
			
			if(largest < currentNumber)
			{
				largest = currentNumber;
			}
			
			if(smallest > currentNumber)
			{
				smallest = currentNumber;
			}
			System.out.print("Press 0 to Exit or 1 to continue");
			sentinal = Keyboard.readInt();
		
		}
		System.out.println("The largest number is " + largest);
		System.out.println("The smallest number is " + smallest);
	}
}