class Exercise52 {
	static boolean equal(int i, int j, int z) {
		if ((i + j) == z) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		int i = 20;
		int j = 15;
		int z = 35;

		boolean q = equal(i, j, z);
		System.out.println(q);
	}
}