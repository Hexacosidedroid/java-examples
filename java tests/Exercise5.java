class Exercise5 {
	public static void main(String[] args)
	throws java.io.IOException {
		int i, j;

		System.out.print("Enter first number: ");
		i = Character.getNumericValue(System.in.read());
		System.out.print("Enter second number: ");
		j = Character.getNumericValue(System.in.read());
		i*=j;
		System.out.print("Sum: "+i);
	}	
}