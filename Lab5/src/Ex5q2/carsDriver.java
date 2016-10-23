package Ex5q2;

import Ex5q2.carsArray;

public class carsDriver {

	public static void main(String[] args) {
		int index;
		
		carsArray bigCar = new carsArray();
		for(index = 0; index < bigCar.length; index ++)
		{
			
			System.out.println(bigCar.car[index].toString());
		}

	}

}
