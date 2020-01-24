class TwoDShape {
	private double width;
	private double heigth;

	TwoDShape() {
		
	}

	TwoDShape(double w, double h) {
		width = w;
		heigth = h;
	}

	double getWidth() { return width; }
	double getHeigth() { return heigth; }
	void setWidth(double w) { width=w; }
	void setHeigth(double h) { heigth=h; }

	void showDim() {
		System.out.println(width+" "+heigth);
	}
}

class Triangle extends TwoDShape {
	private String style;

	Triangle(String s, double w, double h) {
		super(w,h);
		style=s;
	}

	double area() {
		return getWidth()*getHeigth()/2;
	}

	void showStyle() {
		System.out.println("Triangle "+style);
	}
}

class Shapes4 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle("painted",4.0,4.0);
		Triangle t2 = new Triangle("contur",8.0,12.0);

		System.out.println("t1 info");
		t1.showStyle();
		t1.showDim();
		System.out.println(t1.area());

		System.out.println();

		System.out.println("t2 info");
		t2.showStyle();
		t2.showDim();
		System.out.println(t2.area());
	}
}