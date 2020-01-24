class VarArgs3 {
	static void vaTest(int ... v) {
		System.out.println("vaTest(int ... v) "+v.length);
		System.out.println("consist");

		for (int i=0; i<v.length; i++) {
			System.out.println("args "+i+": "+v[i]);
		}
		System.out.println();
	}

	static void vaTest(boolean ... v) {
		System.out.println("vaTest(boolean ... v) "+v.length);
		System.out.println("consist");

		for (int i=0; i<v.length; i++) {
			System.out.println("args "+i+": "+v[i]);
		}
		System.out.println();
	}

	static void vaTest(String msg, int ... v) {
		System.out.println("vaTest(String msg, int ... v) "+msg+" "+v.length);
		System.out.println("consist");

		for (int i=0; i<v.length; i++) {
			System.out.println("args "+i+": "+v[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
			vaTest(1,2,3);
			vaTest("Test",10,20);
			vaTest(true,false,true);
		}	
}