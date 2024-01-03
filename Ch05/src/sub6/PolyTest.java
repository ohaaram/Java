package sub6;
/*
 * 날짜 : 2024/01/03
 * 이름 : 오아람
 * 내용 : Java 다형성 실습하기
 */

public class PolyTest {
	public static void main(String[] args) {
		
		//업캐스팅으로 다형성 구현
		Animal t= new Tiger();
		t.move();
		t.hunt();//애니멀 클래스에 hunt메서드가 정의되지 않아서 에러가 뜸
		//hunt()를 실행하고프면 hunt()를 애니멀에 추가해서 override를 해줘야지 쓸 수 있음.
		
		Animal e= new Eagle();
		e.move();
		e.hunt();
		
		Animal s = new Shark();
		s.move();
		s.hunt();
		
		
		//객체 타입 비교연산
		
		if(t instanceof Tiger) {
			System.out.println("t는 Tigher입니다.");
		}if(e instanceof Eagle) {
			System.out.println("e는 Eagle입니다.");
		}if(s instanceof Shark) {
			System.out.println("s는 Shark입니다.");
		}
		
	}

}
