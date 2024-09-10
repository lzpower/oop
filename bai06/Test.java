package huynhAnhTrong.bai06;

public class Test {
	public static void main(String[] args) {
		try {
			ThongTinDangKyXe xe[] = new ThongTinDangKyXe[3];
			xe[0] = new ThongTinDangKyXe("Nguyễn Thu Loan", "Future Neo",
					35000000, 100);
			xe[1] = new ThongTinDangKyXe("Lê Minh Tính", "Ford Ranger",
					250000000, 3000);
			xe[2] = new ThongTinDangKyXe("Nguyễn Minh Triết", "Landscape",
					1000000000, 1500);
			System.out.println(String.format("%-20s %-20s %-10s %-15s %s",
					"Tên chủ xe", "Loại xe", "Dung tích", "Trị giá",
					"Thuế phải nộp"));
			System.out
					.println("==================================================================================");
			for (int i = 0; i < 3; i++)
				System.out.println(xe[i]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
