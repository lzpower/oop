package huynhAnhTrong.bai04;

public class DiemSinhVien {
	private int maSV;
	private String hoTen;
	private float diemLT, diemTH;

	public DiemSinhVien() {
		this.maSV = 1;
		this.hoTen = "xxx";
		this.diemLT = 0.0f;
		this.diemTH = 0.0f;
	}

	public DiemSinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
		setMaSV(maSV);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		if (maSV > 0)
			this.maSV = maSV;
		else
			this.maSV = 1;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		if (hoTen != null && !hoTen.trim().isEmpty())
			this.hoTen = hoTen;
		else
			this.hoTen = "xxx";
	}

	public float getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(float diemLT) {
		if (diemLT >= 0.0 && diemLT <= 10.0)
			this.diemLT = diemLT;
		else
			this.diemLT = 0.0f;

	}

	public float getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(float diemTH) {
		if (diemTH >= 0.0 && diemTH <= 10.0)
			this.diemTH = diemTH;
		else
			this.diemTH = 0.0f;
	}

	public float tinhDTB() {
		return (diemLT + diemTH) / 2;
	}

	public String layTieuDe() {
		return String.format("%-10s%-30s%-8s%-8s%s", "maSV", "hoTen", "diemLT",
				"diemTH", "diemTB");
	}

	public String toString() {
		return String.format("%-10d%-30s%-8.2f%-8.2f%.2f", maSV, hoTen, diemLT,
				diemTH, tinhDTB());
	}

}
