package sub1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * 날짜 : 2024/01/17
 * 이름 : 오아람
 * 내용 : Java HTTP 통신 실습하기
 */

public class HttpTest {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedReader br = null;
		try {
			URL url = new URL("https://google.com");
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			fos = new FileOutputStream("./Result.txt");
			//./->현재 디렉토리("sub1 패키지 하위에 result.txt가 만들어진다.)
			String line= null;
			while((line=br.readLine())!=null) {//문자스트림으로 데이터를 읽음. 읽을 라인이 없다면 끝
				System.out.println(line);
				fos.write(line.getBytes());
			}
			
			br.close();
			fos.close();
			
		} catch (MalformedURLException e) {//없는 주소에 대한 예외
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}

}
