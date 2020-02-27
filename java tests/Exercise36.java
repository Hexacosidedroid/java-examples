import java.lang.Math;

class Exercise36 {
	public static void main(String[] args) {
		double x1 = 70.09;
		double x2 = 29.77;
		double y1 = 40.93;
		double y2 = 160.90;

		System.out.println(distance(x1, x2, y1, y2));	
	}

	static double distance(double x1, double y1, double x2, double y2) {
		double r = 6371.01;

		return r*Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
	}
}