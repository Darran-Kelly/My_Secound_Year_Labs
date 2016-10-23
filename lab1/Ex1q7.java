public class Ex1q7
{
	public static void main(String args[])
	{
		int inputTempiture;
		
		System.out.print("Enter a tempiture in celsius ");
		inputTempiture = Keyboard.readInt();
		
		if(inputTempiture >= -10 && inputTempiture <= 5)
		{
			System.out.print("Very Cold");
		}
		else if(inputTempiture >= 6 && inputTempiture <= 15)
		{
			System.out.print("Cold");
		}
		else if(inputTempiture >= 16 && inputTempiture <= 22)
		{
			System.out.print("Warm");
		}
		else if(inputTempiture >= 23 && inputTempiture <= 30)
		{
			System.out.print("Hot");
		}		
		else 
		{
			System.out.print("Error Temp is out of range");
		}		
	}
}