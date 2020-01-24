class TwoDShape {
	private double width;
	private double height;

	double getWidth() {
		return width;
	}
	double getHeigth() {
		return height;
	}
	void setWidth(double w) {
		width=w;
	}
	void setHeight(double h) {
		height=h;
	}

	void showDim() {
		System.out.println(width+" "+height);
	}
}

class Triangle extends TwoDShape {
	String style;

	double area() {
		return getWidth()*getHeigth()/2;
	}
	void showStyle() {
		System.out.println("Triangle "+style);
	}
}

class Shapes2 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();

		t1.setWidth(4.0);
		t1.setHeight(4.0);
		t1.style="painted";

		t2.setWidth(8.0);
		t2.setHeight(12.0);
		t2.style="contur";

		System.out.println("t1 info");
		t1.showStyle();
		t1.showDim();
		System.out.println(t1.area());

		System.out.println();

		System.out.println("t1 info");
		t2.showStyle();
		t2.showDim();
		System.out.println(t2.area());
	}
}