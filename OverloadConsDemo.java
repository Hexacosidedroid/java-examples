class MyClass {
	int x;

	MyClass() {
		System.out.println("Inside MyClass()");
		x=0;
	}

	MyClass(int i) {
		System.out.println("Inside MyClass(int)");
		x=i;
	}

	MyClass(double d) {
		System.out.println("Inside MyClass(double)");
		x=(int) d;
	}

	MyClass(int i, int j) {
		System.out.println("Inside MyClass(int, int)");
		x=i*j;
	}
}

class OverloadConsDemo {
	public static void main(String[] args) {
		MyClass t1 = new MyClass();
		MyClass t2 = new MyClass(88);
		MyClass t3 = new MyClass(10.5);
		MyClass t4 = new MyClass(4,5);

		System.out.println(t1.x);
		System.out.println(t2.x);
		System.out.println(t3.x);
		System.out.println(t4.x);
	}
}