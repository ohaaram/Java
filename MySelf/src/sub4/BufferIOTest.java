package sub4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferIOTest {
	public static void main(String[] args) {
		String source ="C:\\Users\\java\\Desktop\\Java.zip";
		String target ="C:\\Users\\java\\Desktop\\JavaCopy.zip";
		
		try {
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while(true) {
				int data = bis.read();
				if(data==-1)
					break;
				bos.write(data);				
			}
			bos.flush();
			bis.close();
			bos.close();
			fis.close();
			fos.close();		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
