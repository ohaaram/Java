package sub16;

public class CarAgency implements Rentable<Car01>{

	@Override
	public Car01 rent() {
		return new Car01();
	}
	

}
