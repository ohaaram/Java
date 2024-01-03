package sub4;

public class Account {
	protected String bank;
	protected String id;
	protected String name;
	protected int balance;

	public Account(String bank, String id, String name, int balance) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(int money) {
		balance = balance + money;
	}

	public void withdraw(int money) {
		balance = balance - money;
	}

	public void show() {
		System.out.println("은행 이 름  : " + bank);
		System.out.println("고객 계 좌  :" + id);
		System.out.println("고객 이 름  :" + name);
		System.out.println("나의 금  액 :" + balance);
	}
}
