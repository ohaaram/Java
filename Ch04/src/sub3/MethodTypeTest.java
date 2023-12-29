package sub3;
/*
 * 날짜 : 2023/12/29
 * 이름 : 오아람
 * 내용 : Method 형태 실습하기
 */

public class MethodTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double y1 = type1(1.5);
		double y2 = type1(1.7);

		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);

		type2(true);
		type2(false);

		boolean result = type3();
		System.out.println("result: " + result);

		type4();
	}

	// 형태1 - 매개변수o, 리턴값 o
	public static double type1(double x) {
		double y = (x * x) + 3.14;

		return y;
	}

	// 형태2 - 매개변수o, 리턴값 x
	public static void type2(boolean status) {
		if (status) {
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		}

	}

	// 형태3 - 매개변수x, 리턴값 o

	public static boolean type3() {// 메서드는 소문자로 시작함!!(규칙)
		int num1 = 1;
		int num2 = 2;

		if (num1 > num2) {
			return true;
		} else {
			return false;
		}
	}

	// 형태4 - 매개변수x, 리턴값 x

	public static void type4() {
		double result = type1(2.5);
		System.out.println("반지름 길이가 2.5인 원의 넓이 : " + result);
	}
}
