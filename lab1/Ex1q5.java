public class Ex1q5
{
	public static void main(String args[])
	{
		double Fahrenheit = 32;
		double Celsius = 0 ;
		final int max = 212;
		
		System.out.println("Fahrenheit        Celsius");
		
		while (Fahrenheit <= max)
		{
			Celsius = ((Fahrenheit - 32) * 5) / 9;
			Celsius = Math.round(Celsius);
			System.out.println("   " + (int) Fahrenheit + "         " + (int)Celsius);
			Fahrenheit = Fahrenheit + 12;
		}
	}
}