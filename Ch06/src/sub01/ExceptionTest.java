package sub01;

/*
 * 날짜 : 2024/01/08
 * 이름 : 오아람
 * 내용 : Java 예외처리 실습하기
 */

public class ExceptionTest {
	public static void main(String[] args) {

		//////////////////////////////////////////////
		// 실행 예외(런타임) - 실행을 했을 때 알 수 있음(테스트에서 잡아야함)
		/////////////////////////////////////////////

		// 예외상황1. 어떤수를 0으로 나눌때
		int num1 = 1;
		int num2 = 0;
		int r1 = 0;
		int r2 = 0;
		int r3 = 0;
		int r4 = 0;

		try {
			// 예외가 발생할 코드
			r1 = num1 + num2;
			r2 = num1 - num2;
			r3 = num1 * num2;
			r4 = num1 / num2;
		} catch (Exception e) {// Exception e->대신에 ArithmeticException e를 써도 된다.Exception e가 최상위(부모클래스)라
								// arithmetic이 자식클래스
			// 그렇기 때문에 Exception e를 써도 됨. 더 선호. 왜냐면 다른 예외가 또 일어날 수 있기때문에 부모 클래스로 예외처리를 해주면
			// 좋다.
			// 예외가 발생했을 때
			e.printStackTrace();// 예외정보를 출력.
		}

		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);

		// 예외상황2. 배열의 인덱스번호가 없을 때
		int[] arr = { 1, 2, 3, 4, 5 };

		try {
			for (int i = 0; i <= 6; i++) {
				System.out.println("arr[" + i + "] : " + arr[i]);
			}
		} catch (Exception e) {// ->정확한 에러는 (ArrayIndexOutOfBoundsException e)
			e.printStackTrace();
		}

		// 예외상황3. 객체생성 없이메서드 호출
		Animal a = null;// 객체의 주소값이 a에 저장되어야하는데 지금 a에는 null값이 들어있음.

		try {
			a.move();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} // 목적은 프로그램이 계속 진행될 수 있게 해주는것.

		// 예외상황4. 잘못된 캐스팅

		Animal a1 = new Tiger();// 업캐스팅
		Animal a2 = new Eagle();
		Animal a3 = new Shark();

		try {
			Tiger tiger = (Tiger) a1;// 다운캐스팅, 강제형변환
			Shark shark = (Shark) a2;// 잘못된 다운캐스팅,a2는 Eagle을 담고 있는데 갑자기 shark로 다운캐스팅을 해버림

			tiger.move();
			tiger.hunt();

			shark.move();
			shark.hunt();
		} catch (ClassCastException e) {
			e.printStackTrace();
		}

		//////////////////////////////////////////////
		// 일반 예외(컴파일 타임)
		//////////////////////////////////////////////
		
		try {
			Class animal = Class.forName("sub1.Lion");//sub1에 Lion이란 클래스가 있는가?
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//예외처리 발생여부에 상관없이 마지막에 항상 실행되는 코드
			System.gc();//메모리 정리하는 가비지 컬렉터 : heap에 있는 것들을 없애줌..
			
			System.out.println("finally 실행....");
		}
		
		System.out.println("프로그램 정상 종료....");
		
	}

}
