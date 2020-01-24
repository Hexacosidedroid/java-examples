class ExcDemo1 {
	public static void main(String[] args) {
		int nums[]=new int[4];
		try {
			System.out.println("Before generation exception");
			nums[10]=10;
			System.out.println("This string never shows");
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Out of range");
		}
		System.out.println("After generation exception");
	}
}