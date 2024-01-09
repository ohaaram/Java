package sub5;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.tire = new Tire();
		myCar.run();
		
		myCar.tire = new HankookTire();//Tire tire=new HankookTire();
		myCar.run();
		
		myCar.tire= new KumhoTire();//Tire tire=new KumhoTire();
		myCar.run();
	}
}
