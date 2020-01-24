class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;
}

class TwoVehicle {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportcars = new Vehicle();

		int range1, range2;

		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		sportcars.passengers = 2;
		sportcars.fuelcap = 14;
		sportcars.mpg = 12;

		range1 = minivan.fuelcap * minivan.mpg;
		range2 = sportcars.fuelcap * sportcars.mpg;

		System.out.println(range1);
		System.out.println(range2);
	}
}