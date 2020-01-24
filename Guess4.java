class Guess4 {
	public static void main(String[] args)
		throws java.io.IOException {
		char ch, ignore, answer = 'S';

		do {
			ch = (char) System.in.read();
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');
			if (ch == answer) {
				System.out.println("correct");
			}
			else {
				System.out.println("sorry try");
				if (ch < answer) {
					System.out.println("right");
				}
				else System.out.println("left");
				System.out.println("try again");
			}
		} while (answer != ch);
	}
}