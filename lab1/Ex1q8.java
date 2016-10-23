public class Ex1q8
{
	public static void main(String args[])
	{
		double Fahrenheit = 32;
		double Celsius = 0 ;
		final int max = 212;
		String tempComment;
		
		System.out.println("Fahrenheit        Celsius        Comment");
		
		while (Fahrenheit <= max)
		{
			if(Fahrenheit <= 20)
					{
						tempComment = "Cold";
					}
				if(Fahrenheit <= 50)
					{
						tempComment = "Warm";
					}
				else
					{
						tempComment = "Hot";
					}
			Celsius = ((Fahrenheit - 32) * 5) / 9;
			Celsius = Math.round(Celsius);
			System.out.println("   " + (int) Fahrenheit + "         " + (int)Celsius);
			Fahrenheit = Fahrenheit + 12;
		}
	}
}