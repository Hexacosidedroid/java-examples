class SeriesDemo {
	public static void main(String[] args) {
		ByTwos twoOb=new ByTwos();
		ByThrees threeOb=new ByThrees();
		Series ob;

		for (int i=0; i<5; i++) {
			ob=twoOb;
			System.out.println("next two "+ob.getNext());
			ob=threeOb;
			System.out.println("next three "+ob.getNext());
		}
		System.out.println("\ncancel");
		twoOb.reset();
		threeOb.reset();
		for (int i=0; i<5; i++) {
			ob=twoOb;
			System.out.println("next two "+ob.getNext());
			ob=threeOb;
			System.out.println("next three "+ob.getNext());
		}
		System.out.println("\nBasic: 100");
		twoOb.setStart(100);
		threeOb.setStart(100);
		for (int i=0; i<5; i++) {
			ob=twoOb;
			System.out.println("next two "+ob.getNext());
			ob=threeOb;
			System.out.println("next three "+ob.getNext());
		}
	}
}