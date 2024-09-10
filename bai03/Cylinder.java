package huynhAnhTrong.bai03;

public class Cylinder {
	private int bk, cc;

	public int getBk() {
		return bk;
	}

	public void setBk(int bk) {
		this.bk = bk;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public Cylinder() {
	}

	public Cylinder(int bk, int cc) {
		this.bk = bk;
		this.cc = cc;
	}

	public double tinhDTXQ() {
		return 2 * Math.PI * bk * cc;
	}

	public double tinhDTTP() {
		return 2 * Math.PI * bk * (bk + cc);
	}

	public double tinhTheTich() {
		return Math.PI * bk * bk * cc;
	}

	public String toString() {
		return String
				.format("ban kinh: %d\t Chieu cao: %d\nDTXQ: %.2f\nDTTP: %.2f\nThe tich: %.2f\n",
						bk, cc, tinhDTXQ(), tinhDTTP(), tinhTheTich());
	}

}
