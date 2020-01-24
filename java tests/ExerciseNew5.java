import java.util.Scanner;

class Exercise5 {
	public static void main(String[] args)
	throws java.io.IOException {
		Scanner scanner = new Scanner(System.in);
		int i, j;

		System.out.print("Enter first number: ");
		i = scanner.nextInt();
		System.out.print("Enter second number: ");
		j = scanner.nextInt();
		i*=j;
		System.out.print("Sum: "+i);
	}	
}