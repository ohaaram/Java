package sub4;
/*
 * 날짜 : 2024/01/03
 * 이름 : 오아람
 * 내용 : Java 상속 실습하기
 */


public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Car 상속객체 생성
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		//stack에 있는 sonata는 heap(car와 sedan이 있다)에 있는 car클래스를 참조한다(sedan이 아니라)
		sonata.speedUP(80);
		sonata.speedTurbo();
		sonata.show();
		
		Truck bongo= new Truck("봉고","남색", 0, 0);
		bongo.load(100);
		bongo.speedUP(60);
		bongo.show();
		
		
		StockAccount kb = new StockAccount("KB", "101-12-1011", "홍길동", 1000000, "삼성전자"
				, 0, 0);
		//kb.bank="KB증권";->이렇게 초기화하면 안됨.에러가 안뜨는 이유는 같은 패키지는 사용가능하기 때문에		
		kb.deposit(1000000);
		kb.buy(10, 50000);
		kb.sell(5, 50000);
		kb.show();
	}

}
