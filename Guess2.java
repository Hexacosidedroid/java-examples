class Guess2 {
	public static void main(String[] args) 
	throws java.io.IOException {
		char ch, answer = 'S';

		System.out.println("Guess letter from A to Z");

		ch = (char) System.in.read();

		if (ch == answer) {
			System.out.println("correct!");
		}
		else {
			System.out.println("try again!");
		}
	}
}