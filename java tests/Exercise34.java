import java.util.Scanner;
import java.lang.Math;

class Exercise34 {
	public static void main(String[] args)
	throws java.io.IOException {
		Scanner s = new Scanner(System.in);
		double i;

		System.out.print("Enter number");
		i = s.nextInt();

		i=(6*Math.pow(i, 2)/(4*Math.tan((Math.PI)/6)));
		System.out.println(i);
	}
}