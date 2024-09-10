package huynhAnhTrong.bai08;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private final double RATE = 0.035;

	public Account() {
		this(999999, "chưa xác định", 50000);
	}

	public Account(long accountNumber, String name, double balance) {
		this.accountNumber = (accountNumber > 0) ? accountNumber : 999999;
		this.name = (name != null && !name.trim().isEmpty()) ? name
				: "chưa xác định";
		this.balance = (balance >= 50000) ? balance : 50000;
	}

	public Account(long accountNumber, String name) {
		this(accountNumber, name, 50000);
	}

	public long getaccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		}
		return false;
	}

	public boolean withdraw(double amount, double fee) {
		if (amount > 0 && amount + fee <= balance) {
			balance -= (amount + fee);
			return true;
		}
		return false;
	}

	public void addInterest() {
		balance += (balance * RATE);
	}

	public boolean transfer(Account acc2, double amount) {
		if (amount > 0 && acc2 != null && withdraw(amount, 0)) {
			acc2.deposit(amount);
			return true;
		}
		return false;
	}

	public String toString() {
		Locale local = new Locale("vi", "vn");
		NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
		return String.format("%-15d %-30s %s", accountNumber, name,
				formatter.format(balance));
	}
}
