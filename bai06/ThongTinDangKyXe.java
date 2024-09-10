package huynhAnhTrong.bai06;

public class ThongTinDangKyXe {
	private String chuXe, loaiXe;
	private double triGia;
	private int dungTich;

	public ThongTinDangKyXe() {
		this.chuXe = "";
		this.loaiXe = "";
		this.triGia = 0;
		this.dungTich = 0;
	}

	public ThongTinDangKyXe(String chuXe, String loaiXe, double triGia,
			int dungTich) throws Exception {
		setChuXe(chuXe);
		setLoaiXe(loaiXe);
		setTriGia(triGia);
		setDungTich(dungTich);
	}

	public String getChuXe() {
		return chuXe;
	}

	public void setChuXe(String chuXe) throws Exception {
		if (chuXe != null && !chuXe.trim().isEmpty())
			this.chuXe = chuXe;
		else
			throw new Exception("Ten chu xe khong hop le.");
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) throws Exception {
		if (loaiXe != null && !loaiXe.trim().isEmpty()) {
			this.loaiXe = loaiXe;
		} else {
			throw new Exception("Loai xe khong hop le");
		}
	}

	public double getTriGia() {
		return triGia;
	}

	public void setTriGia(double triGia) throws Exception {
		if (triGia >= 0)
			this.triGia = triGia;
		else
			throw new Exception("Tri gia xe khong hop le");
	}

	public int getDungTich() {
		return dungTich;
	}

	public void setDungTich(int dungTich) throws Exception {
		if (dungTich >= 0)
			this.dungTich = dungTich;
		else
			throw new Exception("Dung tich xi lanh khong hop le");
	}

	public double tinhThue() {
		if (dungTich < 100)
			return triGia * 0.01;
		else if (dungTich < 200)
			return triGia * 0.03;
		else
			return triGia * 0.05;
	}

	public String toString() {
		return String.format("%-20s %-20s %-10d %-15.2f %.2f", chuXe, loaiXe,
				dungTich, triGia, tinhThue());
	}

}
