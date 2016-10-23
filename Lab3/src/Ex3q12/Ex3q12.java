package Ex3q12;
//import Keyboard;

public class Ex3q12 // driver class for rectangle 
{
	public static void main(String args[])
	{
		float width;	
		float length;
		
		// getting user input
		System.out.print("Enter a length value");
		length = Keyboard.readFloat(); // setting the value of length
		Rectangle.setLength(length);
		System.out.print("Enter a width value");
		width = Keyboard.readFloat();
		Rectangle.setWidth(width);
		// print values to screen
		System.out.println("The area: " + Rectangle.area());
		System.out.println("The perminater: " + Rectangle.perminater());
		
	}
}