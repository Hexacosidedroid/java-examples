class Guess3 {
	public static void main(String[] args)
		throws java.io.IOException {

			char ch, answer = 'S';

			System.out.println("A-Z");

			ch = (char) System.in.read();
			if (ch == answer) System.out.println("correct");
			else {
				System.out.println("correct letter locate at the");
				if (ch<answer)
					System.out.println("left");
				else System.out.println("right");
			}
		}
}