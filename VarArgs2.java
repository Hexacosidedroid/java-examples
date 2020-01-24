class VarArgs2 {
	static void vaTest(String msg, int ... v) {
		System.out.println(msg+" "+v.length);
		System.out.println("consist");

		for(int i=0; i<v.length; i++)
			System.out.println("arg "+i+": "+v[i]);

		System.out.println();
	}

	public static void main(String[] args) {
		vaTest("one",10);
		vaTest("three",1,2,3);
		vaTest("zero");
	}
}