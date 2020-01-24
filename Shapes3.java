class TwoDShape {
	private double width;
	private double heigth;

	double getWidth() { return width; }
	double getHeigth() { return heigth; }
	void setWidth(double w) { width=w; }
	void setHeigth(double h) { heigth=h; }

	void showDim() {
		System.out.println("width and heigth "+width+" "+heigth);
	}
}

class Triangle extends TwoDShape {
	private String style;

	Triangle(String s, double w, double h) {
		setWidth(w);
		setHeigth(h);

		style=s;
	}

	double area() {
		return getWidth()*getHeigth()/2;
	}

	void showStyle() {
		System.out.println("Triangle "+style);
	}
}

class Shapes3 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle("pointed",4.0,4.0);
		Triangle t2 = new Triangle("contur",8.0,12.0);

		System.out.println("info t1");
		t1.showStyle();
		t1.showDim();
		System.out.println(t1.area());

		System.out.println();

		System.out.println("info t1");
		t2.showStyle();
		t2.showDim();
		System.out.println(t2.area());
	}
}