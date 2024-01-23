package sub16;

import java.io.IOException;

public class FileWriter implements AutoCloseable{
	
	public FileWriter(String filePath)throws IOException{
		System.out.println(filePath+" 파일을 엽니다.");//생성자
	}
	
	public void write(String data)throws IOException{
		System.out.println(data+"를 파일에 저장합니다.");//메서드
	}

	@Override
	public void close() throws IOException {
		System.out.println("파일을 닫습니다.");
		
	}

}
