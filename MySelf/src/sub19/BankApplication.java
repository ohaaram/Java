package sub19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BankApplication {

	private static List<Account> accounts = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			// 내용
			try {

				int choice = scanner.nextInt();

				if (choice == 1) {
					createAccount();

				} else if (choice == 2) {
					accountList();

				} else if (choice == 3) {
					deposit();

				} else if (choice == 4) {
					withdraw();

				} else {
					run = false;
				}
			} catch (Exception e) {
				System.out.println("숫자아닌 다른것이 입력되었습니다.");
				scanner.nextLine();
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌생성하기
	private static void createAccount() {
		String ano;
		String owner;
		int balance;

		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");

		System.out.print("계좌번호 : ");
		ano = scanner.next();

		System.out.print("계좌주 : ");
		owner = scanner.next();

		System.out.print("초기입금액 : ");
		balance = scanner.nextInt();

		Account ac = new Account(ano, owner, balance);
		accounts.add(ac);
		System.out.println("결과 : 계좌가 생성되었습니다.");

	}

	// 계좌목록보기
	private static void accountList() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");

		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i) == null) {
				break;
			} else {
				System.out.println(accounts.get(i).getAno() + "\t" + accounts.get(i).getOwner() + "\t"
						+ accounts.get(i).getBalance());
			}
		}
	}

	// 예금하기
	private static void deposit() {

		String ano;
		int balance;

		System.out.println("------");
		System.out.println("예   금");
		System.out.println("------");

		System.out.print("예금번호 : ");
		ano = scanner.next();
		System.out.print("예금액 : ");
		balance = scanner.nextInt();
		
		
		Account account = findAccount(ano);
		
		if (account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		
		for (int i = 0; i < accounts.size(); i++) {

			if (accounts.get(i) == null) {
				break;

			} else if (ano.equals(accounts.get(i).getAno())) {
				accounts.get(i).setBalance(balance);
				break;
			} else
				continue;
		}

	}

	// 출금하기
	private static void withdraw() {

		String ano;
		int balance;

		System.out.println("------");
		System.out.println("출   금");
		System.out.println("------");

		System.out.print("출금번호 : ");
		ano = scanner.next();
		System.out.print("출금액 : ");
		balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		
		if (account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}

		try {
			for (int i = 0; i < accounts.size(); i++) {
				if (accounts.get(i) == null) {
					break;
				} else if (ano.equals(accounts.get(i).getAno())) {
					if (balance > accounts.get(i).getBalance()) {
						Exception e = new Exception("결과 : 출금 실패");
						throw e;
					} else {
						accounts.get(i).setBalance(-balance);
					}
				} else
					continue;
			}
			System.out.println("결과 : 출금이 성공되었습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("현재 계좌에 있는 금액보다 출금 금액이 더 큽니다.");
		}
	}

	// Account 리스트에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		
		Account account = null;
		for (int i = 0; i < accounts.size(); i++) {			
			if (accounts.get(i) != null) {				
				String dbAno = accounts.get(i).getAno();				
				if (dbAno.equals(ano)) {
					account = accounts.get(i);
					break;
				}
			}
		}
		return account;

	}
}
