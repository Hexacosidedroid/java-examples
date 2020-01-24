class ThrowDemo {
	public static void main(String[] args) {
		try {
			System.out.println("before throw");
			throw new ArithmeticException();
		}
		catch (ArithmeticException exc) {
			System.out.println("exception cought");
		}
		System.out.println("after throw");
	}
}