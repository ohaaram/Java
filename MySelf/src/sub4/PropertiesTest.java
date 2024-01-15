package sub4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) {
		
		//프로퍼티 생성
		Properties prop =new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		System.out.println(prop);
		
		
		String target =  "C:\\Users\\java\\Desktop\\Fruit.properties";
		
		try {
			FileOutputStream fos = new FileOutputStream(target);
			
			prop.store(fos, null);
			
			fos.close();		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}

}
