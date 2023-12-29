package sub2;

/*
 * 날짜 : 2023/12/29
 * 이름 : 오아람
 * 내용 : Method 실습하기
 */

public class MethodTest {
	// main method : 자바 프로그램 시작 메서드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메서드 호출
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);
		System.out.println("결과 값1은 : " + y1);
		System.out.println("결과 값2은 : " + y2);
		System.out.println("결과 값3은 : " + y3);

		// 메서드 지역변수와 콜스택:메서드 실행에  사용된 스택을 콜스택이라고 한다.
		int t1=sum(1,10);
		int t2=sum(1,100);
		
		System.out.println("결과 값1은 : " + t1);
		System.out.println("결과 값2은 : " + t2);

	}// main end

	int num = 1;// 전역변수(지역변수랑 색이 다르네..)

	// 메서드 정의
	public static int f(int x) {
		int y = 2 * x + 3;// 지역변수
		return y;
	}

	public static int sum(int start, int end) {
		int total = 0;// 지역변수 total,start,end

		for (int k = start; k <= end; k++) {
			total += k;
		}

		return total;
	}

}
