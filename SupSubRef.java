class Xx {
	int a;

	Xx(int i) {
		a=i;
	}
}

class Yy extends Xx {
	int b;

	Yy(int i, int j) {
		super(j);
		b=i;
	}
}

class SupSubRef {
	public static void main(String[] args) {

		Xx x=new Xx(10);
		Xx x2;
		Yy y=new Yy(5,6);

		x2=x;
		System.out.println(x2.a);

		x2=y;
		System.out.println(x2.a);

		x2.a = 19;
	}
}