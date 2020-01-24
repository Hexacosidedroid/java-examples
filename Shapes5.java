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
		System.out.println("width and height = "+width+" "+height);
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
		style="painted";
	}

	double area() {
		if ((getWidth()==0.0)&&(getHeight()==0.0)) return 0.0;
		else return getWidth()*getHeight()/2;
	}

	void showStyle() {
		System.out.println("Triangle "+style);
	}
}

class Shapes5 {
	public static void main(String[] args) {
		Triangle t1=new Triangle();
		Triangle t2=new Triangle("contur", 8.0, 12.0);
		Triangle t3=new Triangle(4.0);

		System.out.println("info t1 ");
		t1.showStyle();
		t1.showDim();
		System.out.println(t1.area());

		System.out.println();

		System.out.println("info t2 ");
		t2.showStyle();
		t2.showDim();
		System.out.println(t2.area());

		System.out.println();

		System.out.println("info t3 ");
		t3.showStyle();
		t3.showDim();
		System.out.println(t3.area());
	}
}