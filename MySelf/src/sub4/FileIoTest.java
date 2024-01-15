package sub4;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIoTest {
	public static void main(String[] args) {

		String source = "C:\\Users\\java\\Desktop\\Test1.txt";
		String target = "C:\\Users\\java\\Desktop\\Test2.txt";

		try {
			
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);

			while (true) {
				int data = fis.read();
				if (data == -1)
					break;
				char c = (char) data;
				System.out.println(c);
				fos.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료....");

	}

}
