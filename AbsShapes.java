abstract class TwoDShapes {
	private double width;
	private double height;
	private String name;

	TwoDShapes() {
		width=height=0.0;
		name="none";
	}

	TwoDShapes(double w, double h, String n) {
		width=w;
		height=h;
		name=n;
	}

	TwoDShapes(double x, String n) {
		width=height=x;
		name=n;
	}

	TwoDShapes(TwoDShapes ob) {
		width=ob.width;
		height=ob.height;
		name=ob.name;
	}

	double getWidth() { return width; }
	double getHeight() { return height; }
	void setWidth(double w) { width=w; }
	void setHeight(double h) { height=h; }

	String getName() { return name; }

	void showDim() {
		System.out.println("width and height "+width+" "+height);
	}

	abstract double area();
}

class Triangle extends TwoDShapes {
	private String style;

	Triangle() {
		super();
		style="none";
	}

	Triangle(String s, double w, double h) {
		super(w,h,"triangle");
		style=s;
	}

	Triangle(double x) {
		super(x, "triangle");
		style="painted";
	}

	Triangle(Triangle ob) {
		super(ob);
		style=ob.style;
	}

	double area() {
		return getWidth()*getHeight()/2;
	}

	void showStyle() {
		System.out.println("triangle "+style);
	}
}

class Rectangle extends TwoDShapes {
	Rectangle() {
		super();
	}

	Rectangle(double w, double h) {
		super(w,h,"rectangle");
	}

	Rectangle(double x) {
		super(x,"rectangle");
	}

	Rectangle(Rectangle ob) {
		super(ob);
	}

	boolean isSquare() {
		if(getWidth()==getHeight()) return true;
		else return false;
	}

	double area() {
		return getWidth()*getHeight();
	}
}

class AbsShapes {
	public static void main(String[] args) {
		TwoDShapes shapes[]=new TwoDShapes[4];
		shapes[0]=new Triangle("contur",8.0,12.0);
		shapes[1]=new Rectangle(10);
		shapes[2]=new Rectangle(10, 4);
		shapes[3]=new Triangle(7.0);

		for (int i=0; i<shapes.length; i++) {
			System.out.println("object -"+shapes[i].getName());
			System.out.println("area -"+shapes[i].area());
			System.out.println();
		}
	}
}