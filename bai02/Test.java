package huynhAnhTrong.bai02;

public class Test {
	public static void main(String[] args) {
		Point a = new Point();
		System.out.println("a" + a);
		Point a1 = new Point(2, 1);
		System.out.println("a1" + a1);

		a.setX(8);
		a.setY(5);
		System.out.println("Diem a moi: " + a.toString());
		System.out.println("Diem doi xung voi a: " + a.negate());
		System.out.println("Khoang cach den O: " + a.getDistance());
	}
}
