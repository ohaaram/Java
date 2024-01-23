package sub20;

public class User1Thread extends Thread{
	private Calculator calculator;
	
	public User1Thread() {
		setName("User1Thread");
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator=calculator;
	}
	
	public void run() {
		calculator.setMemory1(100);
	}

}
