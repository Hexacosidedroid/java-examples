import java.util.Scanner;

class Exercise33 {
	public static void main(String[] args)
	throws java.io.IOException {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int i;

		System.out.println("Enter number");
		i = scanner.nextInt();
		while (i > 0) {
			sum = sum + i % 10;
			i = i/10;
		}
		System.out.println(sum);
	}

}