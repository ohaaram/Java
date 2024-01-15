package sub4;

import java.io.FileReader;
import java.io.FileWriter;

public class ReaderTest {
	public static void main(String[] args) {
		String source="C:\\Users\\java\\Desktop\\Test1.txt";
		String target="C:\\Users\\java\\Desktop\\Test2.txt";
	
		try {
			FileReader fr = new FileReader(source);
			FileWriter fw = new FileWriter(target);
			
			while(true) {
				int data=fr.read();
				
				if(data==-1)
					break;
				char c =(char)data;
				System.out.print(c);
				fw.write(data);
			}
			fr.close();
			fw.close();	
			System.out.println();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}

}
