import java.util.Scanner;

class Exercise38 {
	public static void main(String[] args)
	throws java.io.IOException {
		Scanner scanner = new Scanner(System.in);
		int l=0;
		int s=0;
		int n=0;
		int o=0;
		
		System.out.print("Enter phrase: ");
		String x = scanner.nextLine();
		char[] ch = x.toCharArray();

		for (int i = 0; i < x.length(); i++) {
			if (Character.isLetter(ch[i])) {
				l++;
			}
			if (Character.isDigit(ch[i])) {
				n++;
			}
			if (Character.isSpaceChar(ch[i])) {
				s++;
			}
			else {
				o++;
			}
		}

		System.out.println("letters "+ l);
		System.out.println("space "+ s);
		System.out.println("number "+ n);
		System.out.println("other "+ o);
	}
}