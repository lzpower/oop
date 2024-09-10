package huynhAnhTrong.bai02;

public class Point {
	private int x, y;

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public Point negate() {
		return new Point(-x, -y);
	}

	public double getDistance() {
		return Math.sqrt(x * x + y * y);
	}

}
