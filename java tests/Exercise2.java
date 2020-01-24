class Summator {
	private int first, second;

	Summator (int i, int j) {
		first=i;
		second=j;
	}

	void Sum() {
		System.out.println(first+second);
	}
}

class Exercise2 {
	public static void main(String[] args) {
		Summator a1 = new Summator(74, 36);
		Summator a2 = new Summator(100, 100);

		a1.Sum();
		a2.Sum();
	}
}