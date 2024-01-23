package sub23;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStream {
	public static void main(String[] args) {
		Path path;
		try {
			path = Paths.get(StreamExample.class.getResource("data.txt").toURI());
			//data.txt 파일 경로(Path) 객체 얻기
			Stream<String> stream=Files.lines(path,Charset.defaultCharset());
			//Path로부터 파일을 열고 한 행씩 읽으면서 문자열 스트림 생성, 기본UTF-8 문자셋으로 읽음
			stream.forEach(line->System.out.println(line));
			stream.close();
		} catch (URISyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
