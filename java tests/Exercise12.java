import java.util.Scanner;

class Exercise12 {
	public static void main(String[] args)
	throws java.io.IOException {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter first: ");
		int a = s.nextInt();
		System.out.print("Enter second: ");
		int b = s.nextInt();
		System.out.print("Enter third: ");
		int c = s.nextInt();

		double avg = (double) (a+b+c)/3;
		System.out.println(avg);
	}
}