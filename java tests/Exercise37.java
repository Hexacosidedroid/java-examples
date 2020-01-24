import java.util.Scanner;

class Exercise37 {
	public static void main(String[] args)
	throws java.io.IOException {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter phrase: ");
		char[] letters = s.nextLine().toCharArray();
		for (int i=letters.length-1; i>=0; i--) {
			System.out.print(letters[i]);
		}
	}
}