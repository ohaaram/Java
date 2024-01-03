package sub1;

public class Sigleton_Test {
	public static void main(String[] args) {
		
		Test_Cal in = Test_Cal.getInstance();
		
		int result=in.oven(20, 50);
		
		System.out.println(result);
	}
}
