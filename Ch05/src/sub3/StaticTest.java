package sub3;
/*
 * 날짜 : 2024/01/02
 * 이름 : 오아람
 * 내용 : Java 클래스 변수, 클래스 메서드 실습하기
 * 
 * 클래스 변수, 클래스 메서드(정적변수, 정적메서드)
 *  - static을 선언한 변수, 메서드로 Method Area에 생성되는 특징
 *  - 별도의 객체 생성(new)없이 클래스 타입으로 바로 참조, 호출
 *  - 객체간의 데이터 공유를 목적으로 클래스(정적) 변수, 클래스(정적) 메서드 사용
 *  
 *  싱글톤(singleton)
 *   - static 을 활용한 싱글톤 객체는 오직 하나의 인스턴스로 메모리상(Mthod Area)에 존재
 *   - 싱글톤 객체를 사용해서 메모리 절약과 성능 향상을 기대
 * 
 */


class Increment{
	 private int num1;
	 public static int num2;
	 
	 public Increment() {
		 num1++;
		 num2++;
		 
		 System.out.println("num1 : "+num1);
		 System.out.println("num2 : "+num2);
	 }
}

public class StaticTest {
	public static void main(String[] args) {
		//Car 객체 생성
		
		Car sonata= new Car("소나타", "흰색", 10);
		Car avante= new Car("아반떼", "검정", 20);
		Car grande= new Car("그랜져", "남색", 30);
		
		
		sonata.show();
		avante.show();
		grande.show();
		
		//전체 차량 수
		
		System.out.println("전체 차량수 : "+Car.count);
		
		//Increment 실습
		Increment in1= new Increment();
		Increment in2= new Increment();
		Increment in3= new Increment();
		
		//결과값 : num1=1,1,1 num2=1,2,3
		//num2는 공유를 해서 결과값을 공유.
		
		//static을 활용한 싱글톤 예제
		//Method Area에 올라간다
		//stack에 있는 cal1,2,3,4는 모두 다 메서드 에리어에 있는 instace(하나임, 여러개 생성아님)를 참조한다.
		//즉 heap영역에 계속 생성되서 메모리를 잡아먹는것이 아니다.
		Calc cal1= Calc.getInstace();
		Calc cal2= Calc.getInstace();
		Calc cal3= Calc.getInstace();
		Calc cal4= Calc.getInstace();
		
		
		
		int rs1=cal1.plus(1, 2);
		int rs2=cal2.mius(1, 2);
		int rs3=cal3.mulit(2, 3);
		int rs4=cal4.div(4, 2);
		
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);
		System.out.println("rs4 : "+rs4);
		
	}

}
