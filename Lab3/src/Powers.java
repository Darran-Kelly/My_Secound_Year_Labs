class Powers
{
	public static void main(String args[])
		{
			int power = 1;
			int result = 0;
			
			while(power <= 10)
				{
					result =(int) Math.pow(2,power);
					System.out.println("2 to the power of" + power + "= " + result);
					power++;
				}
		}
}