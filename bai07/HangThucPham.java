package huynhAnhTrong.bai07;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
	private String maHang;
	private String tenHang;
	private double donGia;
	private LocalDate ngaySanXuat, ngayHetHan;

	public String getMaHang() {
		return maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		if (tenHang != null && !tenHang.trim().isEmpty())
			this.tenHang = tenHang;
		else
			this.tenHang = "xxx";
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if (donGia >= 0) {
			this.donGia = donGia;
		} else {
			this.donGia = 0.0;
		}
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if (ngaySanXuat.isBefore(LocalDate.now()))
			this.ngaySanXuat = ngaySanXuat;
		else
			this.ngaySanXuat = LocalDate.now();
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		if (ngayHetHan.isAfter(this.ngaySanXuat))
			this.ngayHetHan = ngayHetHan;
		else
			this.ngayHetHan = this.ngaySanXuat;
	}

	public HangThucPham(String maHang, String tenHang, double donGia,
			LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception {
		this(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}

	public HangThucPham(String maHang) throws Exception {
		if (maHang != null && !maHang.trim().isEmpty())
			this.maHang = maHang;
		else
			throw new Exception("Ma hang khong hop le");

	}

	public boolean kiemTraDate() {
		return LocalDate.now().isAfter(ngayHetHan);
	}

	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,##0.00");
		String date = kiemTraDate() ? "Hàng hết hạn" : "";
		return String.format("%-10s %-10s %-12s %-15s %-15s %s", maHang,
				tenHang, df.format(donGia), dtf.format(ngaySanXuat),
				dtf.format(ngayHetHan), date);
	}
}
