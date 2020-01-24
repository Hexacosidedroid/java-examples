import java.util.Scanner;

class Exercise32 {
	public static void main(String[] args)
	throws java.io.IOException {
		Scanner s = new Scanner(System.in);
		int i, j;

		System.out.println("Enter first number: ");
		i = s.nextInt();
		System.out.println("Enter second number: ");
		j = s.nextInt();

		if (i!=j) {
			System.out.println(i+"!="+j);
		}
		if (i==j) {
			System.out.println(i+"=="+j);
		}
		if (i<j) {
			System.out.println(i+"<"+j);
		}
		if (i>j) {
			System.out.println(i+">"+j);
		}
		if (i>=j) {
			System.out.println(i+">="+j);
		}
		if (i<=j) {
			System.out.println(i+"<="+j);
		}
	}
}