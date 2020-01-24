import java.io.*;
import java.util.*;

class Exercise44 {
	public static void main(String[] args)
	throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		String second, third;
		int first, i, j;

		System.out.println("Enter number: ");
		first = scan.nextInt();

		second=""+first+first;
		i = Integer.parseInt(second);
		third=""+first+first+first;
		j = Integer.parseInt(third);
		
		int result = first + i + j;
		System.out.println(result);
	}
}