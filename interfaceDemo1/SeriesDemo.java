class SeriesDemo {
	public static void main(String[] args) {
		ByTwos ob = new ByTwos();

		for (int i=0; i<5; i++) {
			System.out.println("next "+ob.getNext());
		}
		System.out.println("\ncancel");
		ob.reset();
		for (int i=0; i<5; i++) {
			System.out.println("next "+ob.getNext());
		}
		System.out.println("\nBasic: 100");
		ob.setStart(100);
		for (int i=0; i<5; i++) {
			System.out.println("next "+ob.getNext());
		}
	}
}