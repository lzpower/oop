package huynhAnhTrong.bai01;

public class Test {

	public static void main(String[] args) {
		ToaDo h = new ToaDo();
		System.out.println(h.getThongTin());

		ToaDo a = new ToaDo(5, 6, "A");
		System.out.println(a.getThongTin());

		a.setX(1);
		a.setY(1);
		a.setTen("B");
		System.out.println("Diem moi " + a.getThongTin());
		System.out.println("Diem moi" + a);
	}

}
