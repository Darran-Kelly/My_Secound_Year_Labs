package Ex3q12;
/**
** Author: Dk         Date: November '15
**
** Description: Program take in two interger the it out put the area and the perminater
**
*/
public class Rectangle
{
	public static float width;	 // veribles
	public static float length;
	public static float a;	
	public static float p;
	
	
	
	
	public static float getWidth()    // getter method 
	{
		return width;  // returns wathever the current value is.
	}
	public static void setWidth(float width) // if user input is under zero or over 20 set the default to one.
	{
		
		if (width >= 0.0 && width <= 20.0) 
		{
			Rectangle.width = width;
		}
		else
		{
			Rectangle.width = 1;
		}
	}
	public static float getLength() 
	{
		return length;
	}
	public static  void setLength(float length) // if user input is under zero or over 20 set the default to one.
	{
		if (length >= 0.0 && length <= 20.0)
		{
			Rectangle.length = length;
		}
		else
			length = 1;
	}
	
	// processing
	public static float area()
	{
		a = length * width; // formaula for area of a rectangle 
		return a;
	}
	public static float perminater() // 
	{
		p = 2 * length + width; //formaula for perminater of a rectangle 
		return p;
	}
	
	

	
}

