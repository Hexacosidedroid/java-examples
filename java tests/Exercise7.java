import java.util.Scanner;

class Exersice7 {
	public static void main(String[] args) 
	throws java.io.IOException {
		Scanner scaner = new Scanner(System.in);
		int i, j;

		System.out.print("Enter number: ");
		i=scaner.nextInt();

		for (j=1; j<10; j++) {
			int l = i*j;
			System.out.println(i+"*"+j+"="+l);
		}
	}
}