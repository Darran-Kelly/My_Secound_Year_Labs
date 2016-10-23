package Ex3q13;

/*
** Author:	Darran Kelly
** Date:	17-11-2015
** Purpose:	multiply	
*/

public class Clock
{
	public static void main (String args[])
	{
		Time z = new Time ();
		z.setTime(11,30,0); // setting a current time 
		long i = System.currentTimeMillis() + 60000; // this set the amount the clock count down to 60 sec
		long g = System.currentTimeMillis() + 1000;  // go up by 1sec every time 
		
		while (System.currentTimeMillis() <= i) // telling the program to run the loop till it hits 60secs
		{
			 while(System.currentTimeMillis() < g); // the semi collon is so the program doesnt run a infinent loop
				 z.tick();
				 System.out.println(z.toString()); // print the new time every sec
				 g = System.currentTimeMillis() + 1000; // add sec to current time
		}
	}
}