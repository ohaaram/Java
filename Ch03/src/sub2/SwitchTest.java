package sub2;

import java.util.Scanner;

/*
 * 날짜 : 2023/12/27
 * 이름 : 오아람
 * 내용 : Java 조건문 Switch 실습하기
 * 
 */
public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자 입력 :");
		
		//사용자 입력
		Scanner scan = new Scanner(System.in);
		//system.in->키보드라고 생각해라!
		//system.out->console이라고 생각
		int number= scan.nextInt();
		
		System.out.println("입력받은 숫자 : "+number);
		
		switch (number%2) {//조건식이 아닌 값을 입력해야됨.
		case 0: 
			System.out.println("number는 짝수입니다.");
			break;
		
		default:
			System.out.println("nubmer는 홀수입니다.");
		}
	}

}
