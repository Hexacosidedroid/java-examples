import java.io.*;
import java.util.*;

class Exercise42 {
	public static void main(String[] args)
	throws java.io.IOException {
		Console console = System.console();
		char [] password = console.readPassword("Enter password: ");
		System.out.print(Arrays.toString(password));
		Arrays.fill(password, ' ');
	}
}