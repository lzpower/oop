package huynhAnhTrong.bai08;

public class Test {
	public static void main(String[] args) {
		Account acc1 = new Account(72354, "Ted Murphy", 100000);
		Account acc2 = new Account(69713, "Jane Smith", 40000);
		Account acc3 = new Account(93757, "Edward Demsey", 700000);

		// Gửi ti�?n
		acc1.deposit(250000);
		acc2.deposit(500000);

		// Rút ti�?n
		acc2.withdraw(430000, 2000);

		// Tính ti�?n lãi
		acc3.addInterest();

		// Xuất thông tin
		System.out.println(String.format("%-15s %-30s %s", "AccountNumber",
				"Name", "Balance"));
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);

		// Chuyển ti�?n từ acc2 sang acc1
		acc2.transfer(acc1, 100000);

		// Xuất thông tin sau khi chuyển ti�?n
		System.out.println("\nSau khi giao dịch");
		System.out.println(String.format("%-15s %-30s %s", "AccountNumber",
				"Name", "Balance"));
		System.out.println(acc1);
		System.out.println(acc2);
	}
}
