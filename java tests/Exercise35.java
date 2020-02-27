import java.lang.Math;

class Poligon {
	static public double find(int a, int b) {

		return (a*Math.pow(b, 2))/(4*Math.tan(Math.PI/a));
	}
}

class Exercise35 {
	public static void main(String[] args) {
		int i = 7;
		int j = 6;

		System.out.println(Poligon.find(7, 6));
	}
}