class ArrayDemo {
	public static void main(String[] args) {
		int smaple[] = new int[10];
		int i;

		for (i=0; i<10; i++) {
			smaple[i] = i;
		}
		for (i=0; i<10; i++) {
			System.out.println(i + " = " + smaple[i]);
		}
	}
}