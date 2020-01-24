import java.util.Scanner;

class Exercise18 {
	public static void main(String[] args)
	throws java.io.IOException {
		Scanner scanner = new Scanner(System.in);
		String s;
		int i, j;

		System.out.print("Enter first number: ");
		i = scanner.nextInt();
		s = Integer.toBinaryString(i);
		System.out.println(s);
		System.out.print("Enter second number: ");
		j = scanner.nextInt();
		s = Integer.toBinaryString(j);
		System.out.println(s);

		i*=j;
		System.out.print("Sum of first and second: ");
		s = Integer.toBinaryString(i);
		System.out.println(s);
	}
}