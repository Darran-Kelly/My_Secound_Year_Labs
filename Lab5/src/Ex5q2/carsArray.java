package Ex5q2;

import Ex5q2.Cars;

public class carsArray {
	public Cars[] car = new Cars[10];
	public int length = car.length;
	
	public carsArray(){
		Cars car1 = new Cars("nissan", "micra", 1.0, "v8","05d89135");
		Cars car2 = new Cars("nissan", "micra", 1.0, "v8","05d89135");
		Cars car3 = new Cars("nissan", "micra", 1.0, "v8","05d89135");
		Cars car4 = new Cars("nissan", "micra", 1.0, "v8","05d89135");
		Cars car5 = new Cars("nissan", "micra", 1.0, "v8","05d89135");
		Cars car6 = new Cars("nissan", "micra", 1.0, "v8","05d89135");
		Cars car7 = new Cars("nissan", "micra", 1.0, "v8","05d89135");
		Cars car8 = new Cars("nissan", "micra", 1.0, "v8","05d89135");
		Cars car9 = new Cars("nissan", "micra", 1.0, "v8","05d89135");
		Cars car10 = new Cars("nissan", "micra", 1.0, "v8","05d89135");
		
		car[0] = car1;
		car[1] = car2;
		car[2] = car3;
		car[3] = car4;
		car[4] = car5;
		car[5] = car6;
		car[6] = car7;
		car[7] = car8;
		car[8] = car9;
		car[9] = car10;
		}

}
