class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;

	int range() {
		return mpg * fuelcap;
	}
}

class RetMeth {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();

		int range1, range2;

		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;

		range1 = minivan.range();
		range2 = sportcar.range();

		System.out.println(range1 + " " + range2);
	}
}