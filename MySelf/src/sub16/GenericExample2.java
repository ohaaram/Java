package sub16;

public class GenericExample2 {
	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.turnOnLight();

		CarAgency carAgency = new CarAgency();
		Car01 car = carAgency.rent();
		car.run();

	}

}
