class Exercise6 {
	static int sum(int a, int b) {
		return a + b;
	}

	static int min(int a, int b) {
		return a - b;
	}

	static int mult(int a, int b) {
		return a * b;
	}

	static int div(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		int a = 125;
		int b = 24;

		System.out.println(sum(a,b));
		System.out.println(min(a,b));
		System.out.println(mult(a,b));
		System.out.println(div(a,b));
	}
}