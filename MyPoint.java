package simeon;

public class MyPoint {
	private double x = 0;
	private double y = 0;
	
	public MyPoint() {
		setX(x);
		setY(y);
	}
	
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double distance(MyPoint a) {
		return this.distance(a.getX(), a.getY());
	}
	public double distance(double x, double y) {
		return Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y));
	}
	public static double distance(MyPoint a, MyPoint b) {
		return a.distance(b.x, b.y);
	}
	
}
