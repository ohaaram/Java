package sub5;
/*
 * 날짜 : 2024/01/03
 * 이름 : 오아람
 * 내용 : Java 메서드 오버라이드 실습하기
 */

class AAA{
	public void method1() {
		System.out.println("AAA::method1....");
	}
	public void method2() {
		System.out.println("AAA::method2....");
	}
	public void method3() {
		System.out.println("AAA::method3....");
	}
}
class BBB extends AAA{
	@Override
	public void method2() {
		System.out.println("BBB::method2....");
	}
	
	//Overload
	public void method3(int a) {
		System.out.println("BBB::method3....");

	}
	
}
class CCC extends BBB{
	
	@Override
	public void method1() {
		System.out.println("CCC::method1....");
	}
	@Override
	public void method2() {
		System.out.println("CCC::method2....");
	}
	//Overload
	public void method3(int a, int b) {
		System.out.println("CCC::method3....");

	}
	
}


public class OverideTest {
	public static void main(String[] args) {
		
		//Overload, Override 실습
		CCC c= new CCC();
		c.method1();//CCC의 method1이 AAA의 method1을 덮어쓴것.그래서 출력이 CCC의 method1로 나옴.
		c.method2();
		c.method3();//AAA method3와 BBB method3은 overload의 관계이다.
		c.method3(0);
		c.method3(1, 2);
		
		Sedan sonata = new Sedan("소나타","흰색",0,2000);
		Truck bongo = new Truck("봉고", "남색", 100, 0);
		
		sonata.speedUP(80);
		sonata.show();
		
		bongo.speedDown(60);
		bongo.show();
	}

}
