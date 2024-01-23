package sub15;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		
		//예금액
		account.deposit(10000);
		System.out.println("예금액 : "+account.getBalance());
		
		//출금액
		try {
			account.withdraw(30000);
		}catch(InsufficientException e) {
			String message=e.getMessage();
			System.out.println(message);
		}		
	}
}
