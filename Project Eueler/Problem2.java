class Fibonachi {
	private int n0 = 1;
	private int n1 = 1;
	private int n2;
	private int x;

	void fibonachiCounter (int x) {
		this.x = x;
		System.out.println(n0 + " " + n1 + " ");
		while(n2<x) {
			n2 = n0 + n1;
			if (n2>x) {
				break;	
			}
			System.out.print(n2 + " ");
			n0 = n1;
			n1 = n2;
		}
	}
}

class Problem2 {
	public static void main(String[] args) {
		int x = 4000000;
		Fibonachi fib = new Fibonachi();

		fib.fibonachiCounter(x);
	}
}