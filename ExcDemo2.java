class ExcTest {
	static void genException() {
		int nums[]=new int[4];
		System.out.println("Before");

		nums[7]=10;
		System.out.println("Dont show");
	}
}

class ExcDemo2 {
	public static void main(String[] args) {
		try{
			ExcTest.genException();
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Out of range");
		}
		System.out.println("After catch");
	}
}