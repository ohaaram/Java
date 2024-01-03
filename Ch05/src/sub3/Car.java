package sub3;

public class Car {

	// 속성(필드)
	private String name;
	private String color;
	private int speed;
	
	
	//클래스 변수(정적변수), methoud area에 생성된다.(stack이나 heap의 영역이 아니다.)
	public static int count;//staic이 붙는건 무조건 public이다.
	
	//클래스 메서드(정적 메서드)
	public static int getCount() {
		return count;
	}
	
	
	//생성자 - 캡슐화된 속성을 초기화하기 위한 메서드
	//초기화 : 변수값을 최초로 대입하는 것.
	public Car(String name,String color, int speed) {//생성자는 반환타입이 없다.메서드 이름은 클래스 이름과 같다.
		this.name=name;
		this.color=color;
		this.speed=speed;
		count++;//생성자가 실행될때 마다 즉 인스턴스가 생성될 때 마다 count가 증가한다.
	}

	// 기능(메서드)
	public void speedUp(int speed) {
		this.speed += speed;
	}

	public void speedDown(int speed) {
		this.speed -= speed;
	}

	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재 속도 : " + this.speed);
	}
	
	//Getter,Setter - 필요에 따라서 정의
	public String getColor() {//get치고 자동완성 시켜주기
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
