package sub2;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=10;
		
		Calcuator calculator = new Calcuator();
		System.out.println("원 면적 :"+calculator.areaCirCle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원 면적 :"+computer.areaCirCle(r));
	}

}
