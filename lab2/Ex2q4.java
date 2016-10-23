

public class Ex2q4
{
	public static void main(String args[])
	{
		int value;
		int value1;
		int i;
		int iB;
		String fact = "";
		
			System.out.println("Enter a number between 1 and 10 ");
			value = Keyboard.readInt();
			value1 = value;
			for(i = value1; i >0; i--)
			{
				fact = fact +  value1 + ".";
				value1 = value1 - 1;
			}
			System.out.print(value + "! = " + fact);
	}
}