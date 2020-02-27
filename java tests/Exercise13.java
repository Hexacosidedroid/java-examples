class Exercise13 {
	static double area(double a, double b) {
		return a * b;
	}

	static double perimeter(double a, double b) {
		return 2 * (a + b);
	}

	public static void main(String[] args) {
		double a = 5.5;
		double b = 8.5;

		System.out.println(area(a,b));
		System.out.println(perimeter(a,b));
	}
}