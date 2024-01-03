package sub5;

public class Sedan extends Car{
	
	private int cc;
	
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name,color,speed);//부모(Car)의 생성자를 호출시켜 초기화를 시켜준다(자식클래스의 의무)
		this.cc=cc;//본인것도 초기화를 시켜준다.
	}
	
	@Override
	public void speedUP(int speed) {
		// TODO Auto-generated method stub
		//super.speedUP(speed);
		this.speed=speed+20;
	}
	
	public void speedTurbo() {
		this.speed+=20;
	}
	public void show() {
		super.show();
		System.out.println("배기량 :"+this.cc);
	}

}
