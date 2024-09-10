package huynhAnhTrong.bai05;

public class Test {
	public static void main(String[] args) {

		HinhTamGiac tg1 = new HinhTamGiac(-1, 2, 3);
		HinhTamGiac tg2 = new HinhTamGiac(1, 2, 8);
		HinhTamGiac tg3 = new HinhTamGiac(3, 4, 6);
		HinhTamGiac tg4 = new HinhTamGiac(3, 3, 4);
		HinhTamGiac tg5 = new HinhTamGiac(3, 3, 3);
		System.out.println(tg1);
		System.out.println(tg2);
		System.out.println(tg3);
		System.out.println(tg4);
		System.out.println(tg5);
		tg4.setMc(3);
		System.out.println(tg4);
	}
}
