class Overload {
	void ovlDemo() {
		System.out.println("without any params");
	}

	void ovlDemo(int a) {
		System.out.println("one params "+a);
	}

	int ovlDemo(int a, int b) {
		System.out.println("two params "+a+" "+b);
		return a + b;
	}

	double ovlDemo(double a, double b) {
		System.out.println("two params (double) "+a+" "+b);
		return a + b;
	}
}

class OverloadDemo {
	public static void main(String[] args) {
		Overload ob = new Overload();
		int resI;
		double resD;

		ob.ovlDemo();
		System.out.println();

		ob.ovlDemo(2);
		System.out.println();

		resI=ob.ovlDemo(4, 6);
		System.out.println("Results resI "+resI);
		System.out.println();

		resD=ob.ovlDemo(1.1, 2.32);
		System.out.println("Results resD "+resD);
		System.out.println();
	}
}