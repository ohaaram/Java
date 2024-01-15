package sub1;
/*
 * 날짜 : 2024/01/11
 * 이름 : 오아람
 * 내용 : Java 데이터 입출력 문자 스트림 실습
 * 
 */
import java.io.FileReader;
import java.io.FileWriter;

public class ReaderTest {
	public static void main(String[] args) {

		String source = "C:\\Users\\java\\Desktop\\Test1.txt";
		String target = "C:\\Users\\java\\Desktop\\Test2.txt";

		try {
			// 스트림 생성(연결)
			FileReader fr = new FileReader(source);
			FileWriter fw = new FileWriter(target);
			while (true) {
				// 파일 읽기
				int data = fr.read();// read의 반환타입은 int이다.
				
				if (data == -1) {
					// 파일 모두 읽었을 때 반복 종료.read의 값이 -1이면 파일의 끝을 가리킨다.
					break;
				}
				char ch=(char)data;
				
				System.out.print(ch);
				//파일 쓰기
				fw.write(data);
			}
			
			//스트림 해제
			fr.close();
			fw.close();

		} catch (Exception e) {//두개의 예외처리를 해야하나 코드가 복잡해지니 최상위 에러코드만 기재.
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료....");
	}
}
