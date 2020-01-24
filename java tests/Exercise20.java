import java.util.Scanner;

class Exercise20 {
	public static void main(String[] args)
	throws java.io.IOException {
		Scanner scanner = new Scanner(System.in);
		String s;

		s = Integer.toHexString(scanner.nextInt());
		System.out.print("hexadecimal number " + s);
	}
}