class Problem1 {
	static int sum;

	static void SumSearch(int i) {
		if((i % 5) == 0 || (i % 3) == 0) {
			sum+=i;
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			SumSearch(i);
		}
		System.out.println(sum);
	}
}