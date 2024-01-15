package sub4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeTest {
	public static void main(String[] args) {
		String source = "C:\\Users\\java\\Desktop\\Apple.txt";

		try {
			FileInputStream fis = new FileInputStream(source);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Apple apple=(Apple)ois.readObject();
			apple.show();
			
			fis.close();
			ois.close();			

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램을 종료합니다..");
	}

}
