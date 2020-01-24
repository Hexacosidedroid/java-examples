class TwoDShape {
	private double width;
	private double height;

	TwoDShape() {
		width=height=0.0;
	}

	TwoDShape(double w, double h) {
		width=w;
		height=h;
	}

	TwoDShape(double x) {
		width=height=x;
	}

	double getWidth() { return width; }
	double getHeight() { return height; }
	void setWidth(double w) { width=w; }
	void setHeight(double h) { height=h; }

	void showDim() {
		System.out.println("width and height "+width+" "+height);
	}
}

class Triangle extends TwoDShape {
	private String style;

	Triangle() {
		super();
		style="none";
	}

	Triangle(String s, double w, double h) {
		super(w,h);
		style=s;
	}

	Triangle(double x) {
		super(x);
		style="pionted";
	}

	double area() {
		return getWidth()*getHeight()/2;
	}
	void showStyle() {
		System.out.println("triangle "+style);
	}
}

class ColorTriangle extends Triangle {
	private String color;

	ColorTriangle(String c, String s, double w, double h) {
		super(s,w,h);
		color=c;
	}

	String getColor() { return color; }

	void showColor() {
		System.out.println("Color "+color);
	}
}

class Shapes6 {
	public static void main(String[] args) {
		ColorTriangle t1=new ColorTriangle("blue","contur",8.0,12.0);
		ColorTriangle t2=new ColorTriangle("red","painted",2.0,2.0);

		System.out.println("info t1");
		t1.showDim();
		t1.showStyle();
		t1.showColor();
		System.out.println(t1.area());

		System.out.println();

		System.out.println("info t2");
		t2.showDim();
		t2.showStyle();
		t2.showColor();
		System.out.println(t2.area());
	}
}