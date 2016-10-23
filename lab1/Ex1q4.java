public class Ex1q4
{
	public static void main(String args[])
	{
		int square = 2;
		int cube = 3;
		int number = 1;
		int resultSquare = 0;
		int resultCube = 0;
		final int max = 5;
		
		System.out.print("number      square       cube");
		
		while(number <= max)
		{
			resultSquare = (int) Math.pow(number,square);
			resultCube = (int) Math.pow(number, cube);
			System.out.println(number + "     " + resultSquare + "     " + resultCube  );
			number ++;
		}
	}
}