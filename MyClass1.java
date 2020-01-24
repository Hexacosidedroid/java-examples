class MyClass {
	private int alpha;
	public int beta;
	int gamma;

	void setAlpha(int a) {
		alpha = a;
	}

	int getAlpha() {
		return alpha;
	}
}

class MyClass1 {
	public static void main(String[] args) {
		MyClass ob = new MyClass();

		ob.setAlpha(-99);
		System.out.println("ob.alpha: "+ob.getAlpha());

		//ob.alpha = 10;

		ob.beta = 88;
		ob.gamma = 99;
	}
}