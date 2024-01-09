package sub02;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 날짜 : 2024/01/08
 * 이름 : 오아람
 * 내용 : Java 예외 던지기 실습하기
 */

//jvm ->main -> method1 ->method2

public class ThrowsTest {
	public static void main(String[] args) {
		try {
			method1(10);
		}catch(ArithmeticException e) {//->요기도 두개 쓸거 없이 exception으로 그냥 잡으면 됨.
			e.printStackTrace();
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}
		

		System.out.println("프로그램 정상 종료....");
	}

	
	//method1 호출한 곳으로 예외 던지기
	public static void method1(int n1) throws ArithmeticException,InputMismatchException {
		method2(n1);
	}

	//method2 호출한 곳으로 예외 던지기
	public static void method2(int n2) throws ArithmeticException,InputMismatchException {//->이렇게 다 적는게 귀찮으면 Exception으로 퉁치면 됨
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자입력 : ");
		int input = sc.nextInt();//예외가 발생할 수 있다(사용자가 문자 입력시) :ArithmeticException

		int result = n2 / input;//예외가 발생할 수 있다.(input값이 0일 경우) :InputMismatchException

		System.out.println("result : " + result);
	}

}
