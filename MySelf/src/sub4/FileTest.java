package sub4;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileTest {
	public static void main(String[] args) {
		String path1 = "C:\\Users\\java\\Desktop\\Source.txt";
		String path2 = "C:\\Users\\java\\Desktop\\MyDir";

		File f1 = new File(path1);
		File f2 = new File(path2);

		try {

			f1.createNewFile();
			f2.mkdir();

			System.out.println(f1.exists());
			System.out.println(f2.exists());

		} catch (Exception e) {
			e.printStackTrace();
		}

		Path source = Paths.get("C:\\Users\\java\\Desktop\\Source.txt");
		Path target = Paths.get("C:\\Users\\java\\Desktop\\Target.txt");
		Path destination = Paths.get("C:\\Users\\java\\Desktop\\MyDir\\Destination.txt");

		try {

			Files.copy(source, target);// 복사
			Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
			Files.delete(target);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}