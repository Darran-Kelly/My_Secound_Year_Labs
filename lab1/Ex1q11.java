public class Ex1q11
{
	public static void main(String args[])
	{
		int index = 32;
		int count = 0;
		
		System.out.println("Unicode Value" + "	" + "Character");
		
		while(index != 127)
		{
			System.out.println(index + "			" + (char)index);
			index++;
			count++;
			
			if(count % 25 == 0)
			{
				Keyboard.readChar();
			}	

		}
	}
}