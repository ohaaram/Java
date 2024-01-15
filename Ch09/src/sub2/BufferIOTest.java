package sub2;
/*
 * 날짜 : 2024/01/11
 * 이름 : 오아람
 * 내용 : Java 데이터 입출력 버퍼 보조 스트림 실습
 * 
 * 1차선으로 데이터를 전송하고 받았다고 생각하면, 버퍼를 달아서 2차선으로 데이터를 전송하고 받는다고 생각하면 된다.
 * 
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferIOTest {
	public static void main(String[] args) {

		String source = "C:\\Users\\java\\Desktop\\Java.zip";
		String target = "C:\\Users\\java\\Desktop\\JavaCopy.zip";

		try {
			// 스트림 생성(연결)
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			//보조 스트림 생성
			BufferedInputStream bis =new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			
			while (true) {
				// 파일 읽기
				int data = bis.read();// read의 반환타입은 int이다.

				if (data == -1) {
					// 파일 모두 읽었을 때 반복 종료.read의 값이 -1이면 파일의 끝을 가리킨다.
					break;
				}
				char ch = (char) data;

				// System.out.print(ch);
				// 파일 쓰기
				bos.write(data);
			}
			
			// 스트림 해제
			bos.flush();//버퍼에 남아있는것들을 비워주기(flush)
			bis.close();
			bos.close();
			fis.close();
			fos.close();

		} catch (Exception e) {// 두개의 예외처리를 해야하나 코드가 복잡해지니 최상위 에러코드만 기재.
			e.printStackTrace();
		}

		System.out.println("프로그램 종료....");
	}

}
