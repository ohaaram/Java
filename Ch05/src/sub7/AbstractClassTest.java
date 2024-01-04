package sub7;
/*
 * 날짜:2024/01/04
 * 이름:오아람
 * 내용:Java 추상클래스 실습하기
 */

public class AbstractClassTest {

	public static void main(String[] args) {
		// Car car =new Car();//객체 생성 불가능(추상클래스이기때문에)
		Car sonata = new Sedan("소나타", "흰색", 0, 2000);
		Car bongo = new Truck("봉고", "남색", 0, 0);
		
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		bongo.speedUp(60);
		bongo.speedDown(10);
		bongo.show();

	}
}
