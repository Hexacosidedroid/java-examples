class ExcTest {
	static void genException() {
		int nums[]=new int[4];

		System.out.println("Before");
		nums[7]=10;
		System.out.println("not showing");
	}
}

class UseThrowableMethods {
	public static void main(String[] args) {
		try {
			ExcTest.genException();
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("standart");
			System.out.println(exc);
			System.out.println("\nstack");
			exc.printStackTrace();
		}
		System.out.println("After");
	}
}