package sub4;

public class StockAccount extends Account {

	private String stock;
	private int amount;
	private int price;

	public StockAccount(String bank, String id, String name, int balance, String stock, int amount, int price) {

		super(bank, id, name, balance);// 부모클래스 생성자 호출 - 초기화

		this.stock = stock;
		this.amount = amount;
		this.price = price;
	}

	public void sell(int amount, int price) {
		this.amount -= amount;
		this.balance += amount * price;// 부모의 변수를 사용할 때는 private가 아니라 protected로 선언.
	}

	public void buy(int amount, int price) {
		this.amount += amount;
		this.balance -= amount * price;

	}

	public void show() {
		super.show();
		System.out.println("주식 종목 : " + this.stock);
		System.out.println("주식 수량 : " + this.amount);
		System.out.println("주식 가격 : " + this.price);
	}

}
