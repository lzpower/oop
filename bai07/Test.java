package huynhAnhTrong.bai07;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		try {
			HangThucPham hang1 = new HangThucPham("001", "Gạo", 100000,
					LocalDate.of(2018, 7, 10), LocalDate.of(2024, 10, 10));
			HangThucPham hang2 = new HangThucPham("002", "Mì", 5000,
					LocalDate.of(2018, 3, 1), LocalDate.of(2018, 9, 1));
			HangThucPham hang3 = new HangThucPham("003", "Nước", 10000,
					LocalDate.of(2017, 3, 1), LocalDate.of(2018, 3, 1));
			System.out.println(String.format(
					"%-10s %-10s %-12s %-15s %-15s %s", "Mã_Hàng", "Tên_Hàng",
					"�?ơn_Giá", "Ngày_Sản_Xuất", "Ngày_Hết_Hạn", "Ghi_Chú"));
			System.out.println(hang1);
			System.out.println(hang2);
			System.out.println(hang3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
