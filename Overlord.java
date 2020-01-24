class Aa {
	int i,j;

	Aa(int a, int b) {
		i=a;
		j=b;
	}

	void show() {
		System.out.println(i+" "+j);
	}
}

class Bb extends Aa {
	int k;

	Bb(int a, int b, int c) {
		super(a,b);
		k=c;
	}

	void show(String msg) {
		System.out.println(msg+k);
	}
}

class Overlord {
	public static void main(String[] args) {
		Bb subOb = new Bb(1,2,3);

		subOb.show("k: ");
		subOb.show();
	}
}