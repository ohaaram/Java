package sub7;


/*
 * 추상클래스
 * - 추상메서드를 갖는 클래스
 * - 상속으로 사용되는 클래스
 * 
 */
public abstract class Car {
	protected String name;
	protected String color;
	protected int speed;

	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	public abstract void speedUp(int speed);//어차피 오버라이딩으로 쓸거라 내용을 쓸 필요가 없다.추상메서드로 쓰임

	public abstract void speedDown(int speed);

	public void show() {
		System.out.println("차량명 :"+this.name);
		System.out.println("차량색 :"+this.color);
		System.out.println("현재속도 :"+this.speed);

	}

}
