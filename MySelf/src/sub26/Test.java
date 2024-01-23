package sub26;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		Random ran1 = new Random(10);
		Random ran2 = new Random(10);
		
		
		int result1=ran1.nextInt();
		int result2=ran2.nextInt();
		
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
	}

}
