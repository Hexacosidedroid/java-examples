class Ada {
	int i;
}

class Bab extends Ada {
	int i;

	Bab(int a, int b) {
		super.i=a;
		i=b;
	}

	void show() {
		System.out.println(super.i);
		System.out.println(i);
	}
}

class UseSuper {
	public static void main(String[] args) {
		Bab subOb = new Bab(1,2);

		subOb.show();
	}
}