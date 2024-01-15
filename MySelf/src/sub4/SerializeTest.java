package sub4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeTest {
	public static void main(String[] args) {
		Apple apple = new Apple("미국",3500);
		
		String target ="C:\\Users\\java\\Desktop\\Apple.txt";
		
		try {
			FileOutputStream fos = new FileOutputStream(target);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(apple);
			
			
			oos.close();
			fos.close();						
		}		
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}

}
