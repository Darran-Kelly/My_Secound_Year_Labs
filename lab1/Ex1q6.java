public class Ex1q6
{
	public static void main(String args[])
	{
		int userAge;
		System.out.print("Enter age: ");
		userAge = Keyboard.readInt();
		
		if (userAge >= 18)
			{
				System.out.println("You are old enough to vote.");
			}
			else
				{
					System.out.println("You are not old enough to vote.");
				}
	}
}