package sub1;
/*
 * 날짜 : 2024/01/16
 * 이름 : 오아람
 * 내용 : Java 함수형 프로그래밍 실습
 * 
 * 
 * 함수형 프로그래밍
 *  - 프로그래밍 단위를 함수(메서드) 위주로 프로그래밍하는 패러다임
 *  - 함수형 프로그래밍을 람다식으로 구현
 *  
 */

interface A {
	public void hello();
}

class B implements A {
	public void hello() {
		System.out.println("HelloWorld...");
	}
}

public class FunctionalTest {
	public static void main(String[] args) {

		// 객체지향 프로그래밍
		A a1 = new B();
		a1.hello();

		// 익명 객체(인터페이스를 바로 객체 생성) ->클래스를 구현하지않고 간단하게 하기위해서 바로 인터페이스를 갖다 쓰네..
		A a2=new A() {

			@Override
			public void hello() {
				System.out.println("HelloWorld...");

			}
		};
		
		a2.hello();
		
		//함수형 프로그래밍
		A a3=()->{System.out.println("HelloWorld...");};//A가 반드시 interface
		
		a3.hello();
	}

}
