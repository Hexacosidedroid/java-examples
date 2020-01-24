class ThrowsDemo {
	public static char prompt(String str) throws java.io.IOException {
		System.out.print(str+" : ");
		return (char) System.in.read();
	}

	public static void main(String[] args) {
		char ch;

		try {
			ch=prompt("enter a letter");
		}
		catch (java.io.IOException exc) {
			System.out.println("IOException");
			ch='X';
		}

		System.out.println("you push the button "+ch);
	}
}