class TwoDShape {
	double width;
	double height;

	void showDim() {
		System.out.println("width and height "+width+" "+height);
	}
}

class Triangle extends TwoDShape {
	String style;

	double area() {
		return width*height/2;
	}

	void showStyle() {
		System.out.println("triangle "+style);
	}
}

class Shapes {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();

		t1.width=4.0;
		t1.height=4.0;
		t1.style="painted";

		t2.width=8.0;
		t2.height=12.0;
		t2.style="contur";

		System.out.println("info t1");
		t1.showStyle();
		t1.showDim();
		System.out.println(t1.area());

		System.out.println();

		System.out.println("info t2");
		t2.showStyle();
		t2.showDim();
		System.out.println(t2.area());
	}
}