package sub20;

import sub17.*;

public class hashcode {

	public static void main(String[] args) {

		Box b1 = new Box();
		Box b2 = new Box();

		// 1) b1, b2의 this 값을 출력
		b1.show();
		b2.show();

		// 2) b1의 toString() 실행 -> 기본 객체 주소 출력
		System.out.println(b1);
		System.out.println(b2);

		// 3) b1, b2 해시값(주소값) 출력
		int b1Hash = b1.hashCode();
		int b2Hash = b2.hashCode();
		System.out.println(b1Hash);
		System.out.println(b2Hash);

		// 4) b1, b2 16진수 주소값 추출(@앞에 패키지.클래스명 제거)
		int idx1 = b1.toString().lastIndexOf("@");
		int idx2 = b2.toString().lastIndexOf("@");
		String b1Hex = b1.toString().substring(idx1 + 1);
		String b2Hex = b2.toString().substring(idx2 + 1);
		System.out.println(b1Hex);
		System.out.println(b2Hex);

		// 5) 16진수 -> 10진수 변환, 위에 3번에서 구한 해시값과 동일함을 알 수 있음
		int b1Decimal = Integer.parseInt(b1Hex, 16);
		int b2Decimal = Integer.parseInt(b2Hex, 16);
		System.out.println(b1Decimal);
		System.out.println(b2Decimal);

		// 6) 결론 b1과 b2의 equals는 주소값을 비교 확인
		// equals 메서드를 Ctrl키를 누르고 마우스 Click해서 정의되어 있는 Object 클래스 162라인 확인할 것
		System.out.println(b1.equals(b2));
	}
}
