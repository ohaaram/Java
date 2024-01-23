package sub15;

public class Account {
	private long balance;
	
	public Account() {}//생성자 생성
	
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance+=money;
	}
	public void withdraw(int money)throws InsufficientException{
		if(balance<money) {
			throw new InsufficientException("잔고부족 :"+(money-balance)+"모자람");
		}
		balance-=money;
	}

}
