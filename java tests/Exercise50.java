class Exercise50 {
	static void div3() {
		for (int i = 0; i < 100; i++) {
			if ((i%3)==0) {
			System.out.print(i + " ");
			}
		}	
	}

	static void div5() {
		for (int i = 0; i < 100; i++) {
			if ((i%5)==0) {
			System.out.print(i + " ");
			}
		}	
	}

	static void div35() {
		for (int i = 0; i < 100; i++) {
			if ((i%5)==0 && (i%3)==0) {
			System.out.print(i + " ");
			}
		}	
	}

	public static void main(String[] args) {
		div3();
		div5();
		div35();
	}
}