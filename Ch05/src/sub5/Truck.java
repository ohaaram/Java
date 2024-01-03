package sub5;

public class Truck extends Car {

	private int capacity;

	public Truck(String name, String color, int speed, int capacity) {
		super(name, color, speed);
		this.capacity = capacity;
	}

	public void load(int capacity) {
		this.capacity += capacity;
	}

	@Override
	public void speedDown(int speed) {
		// TODO Auto-generated method stub
		// super.speedDown(speed);원래 부모에게 있었던 행동들
		this.speed = speed - 10;
	}

	public void show() {

		super.show();
		System.out.println("적재량 : " + this.capacity);
	}

}
