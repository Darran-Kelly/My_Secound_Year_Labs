package Ex3q11;

public class Thermometer
{ // begin Thermometer
	private double celsius;	
	private double fahrenheit;	
	// celsius is accessible to all methods in this class
	
	public Thermometer()		// constructor method #1
	{
		setCelsius(0);		
	}
		
	public Thermometer(double cel)	// constructor method #2
	{
		setCelsius(cel);
	}

	public void setCelsius(double cel)
	{
		celsius = cel;		
	}

	public double getCelsius()
	{
		return celsius;
	}
	public double getFahrenheit()
	{
		fahrenheit = ((celsius * 9) / 5 + 32 ); // formula for celsius 
		return fahrenheit;
	}
	/*public void setFahrenheit()
	{
		this.fahrenheit = fahrenheit;
	}*/
} // end class Thermometer

