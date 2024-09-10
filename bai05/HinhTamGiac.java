package huynhAnhTrong.bai05;

public class HinhTamGiac {
	private int ma, mb, mc;

	public HinhTamGiac() {
		this.ma = 0;
		this.mb = 0;
		this.mc = 0;
	}

	public HinhTamGiac(int ma, int mb, int mc) {
		if (kiemTra(ma, mb, mc)) {
			this.ma = ma;
			this.mb = mb;
			this.mc = mc;
		} else {
			this.ma = 0;
			this.mb = 0;
			this.mc = 0;
		}
	}

	private boolean kiemTra(int ma, int mb, int mc) {
		return ma > 0 && mb > 0 && mc > 0 && (ma + mb > mc) && (ma + mc > mb)
				&& (mb + mc > ma);
	}

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		if (kiemTra(ma, this.mb, this.mc))
			this.ma = ma;
	}

	public int getMb() {
		return mb;
	}

	public void setMb(int mb) {
		if (kiemTra(ma, this.mb, this.mc))
			this.mb = mb;
	}

	public int getMc() {
		return mc;
	}

	public void setMc(int mc) {
		if (kiemTra(ma, this.mb, this.mc))
			this.mc = mc;
	}

	public int tinhChuVi() {
		return ma + mb + mc;
	}

	public float tinhDienTich() {
		float p = (float) tinhChuVi() / 2;
		return (float) Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));
	}

	public String kiemTraTG() {
		if ((ma + mb > mc) && (ma + mc > mb) && (mb + mc > ma))
			return "Khong phai tam giac";
		else if (ma == mb || mb == mc || mc == ma)
			return "Tam giac can";
		else if (ma == mb && mb == mc)
			return "Tam giac deu";
		else
			return "Tam giac thuong";
	}

	public String layTieuDe() {
		return String.format("%-5s %-5s %-5s %-30s %-7s %s", "ma", "mb", "mc",
				"Loai tam giac", "Chu vi", "Dien tich");
	}

	public String toString() {
		if (kiemTraTG().equals("Khong phai tam giac"))
			return String.format("%-5d %-5d %-5d %-30s", ma, mb, mc,
					kiemTraTG());
		else
			return String.format("%-5d %-5d %-5d %-30s %-7d %.2f", ma, mb, mc,
					kiemTraTG(), tinhChuVi(), tinhDienTich());
	}
}
