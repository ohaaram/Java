package sub2;
/*
 * 날짜 : 2024/01/02
 * 이름 : 오아람
 * 내용 : Java 캡슐화 실습하기
 */

public class EncapsuleTest {

	public static void main(String[] args) {
		
		//객체 생성
		Car sonata= new Car("소나타","흰색",10);
		
		
		//캡슐화된 속성에 대한 초기화는 생성자에서 수
		//속성은 무조건 private(캡슐화) 시켜주기
		//메서드는 무조건 public시켜준다.(기본적으로)
		
		
		//sonata.name="소나타";
		//sonata.color="흰색";
		//sonata.speed=10;
		
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		//속성을 바꿔야 할때 -> getter,setter
		sonata.setColor("회색");
		sonata.show();
		
		//Account 객체 생성 및 초기화
		
		Account kb= new Account("국민은행","123-10-1001","김유신",10000);
		/*
		kb.bank="국민은행";
		kb.id="123-10-1001";
		kb.name="김유신";
		kb.balance=10000;
		*/
		
		kb.deposit(80000);
		kb.withdraw(70000);
		kb.show();
		
		
	}
}
