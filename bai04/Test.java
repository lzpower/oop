package huynhAnhTrong.bai04;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		DiemSinhVien sv1 = new DiemSinhVien(23711131, "Huynh Anh Trong", 10, 10);
		DiemSinhVien sv2 = new DiemSinhVien();
		sv2.setMaSV(1365498);
		sv2.setHoTen("Nguyen Van A");
		sv2.setDiemLT(9);
		sv2.setDiemTH(6);
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã số của sinh viên 3: ");
		int maSV = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhập họ và tên của sinh viên 3: ");
		String hoTen = sc.nextLine();
		System.out.print("Nhập điểm lý thuyết của sinh viên 3: ");
		float diemLT = sc.nextFloat();
		System.out.print("Nhập điểm thực hành của sinh viên 3: ");
		float diemTH = sc.nextFloat();
		DiemSinhVien sv3 = new DiemSinhVien(maSV, hoTen, diemLT, diemTH);
		System.out.println(sv1.layTieuDe());
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		sc.close();
	}
}
