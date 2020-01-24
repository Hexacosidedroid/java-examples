class BoolDemo {
	public static void main(String[] args) {
		boolean b;

		b = false;
		System.out.println("b " + b);

		b = true;
		System.out.println("b " + b);

		if (b) {
			System.out.println("b approve");
		}

		b = false;
		if (b) {
			System.out.println("b dont approve");
		}

		System.out.println("10 > 9: " + (10 > 9));
	}

}