package Ex3q11;

public class Ex3q11
{
	public static void main(String args[])
	{
		double celsius;
		
		Thermometer thermA = new Thermometer(); // making an new object 
		System.out.print("Enter a celcius value to be converted ");
		celsius = Keyboard.readDouble(); // setting value user entered
		thermA.setCelsius(celsius);
		System.out.print(thermA.getFahrenheit());
		
	}
}