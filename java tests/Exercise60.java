import java.util.*;
import java.io.*;

class Exercise60 {
	public static void main(String[] args)
	throws IOException {
		Scanner scan = new Scanner(System.in);
		String s;

		System.out.println("Enter phrase: ");
		s=scan.nextLine();

		String[] words = s.split(" ");
		System.out.println(words[words.length-2]);
	}
}