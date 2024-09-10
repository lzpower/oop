package huynhAnhTrong.bai01;

public class ToaDo {
	private int x, y;
	private String ten;

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

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public ToaDo() {
		this.x = 0;
		this.y = 0;
		this.ten = "O";
	}

	public ToaDo(int x, int y, String ten) {
		this.x = x;
		this.y = y;
		this.ten = ten;
	}

	@Override
	public String toString() {
		return "ToaDo [x=" + x + ", y=" + y + ", ten=" + ten + "]";
	}

	public String getThongTin() {
		return ten + "(" + x + "," + y + ")";
	}

}
