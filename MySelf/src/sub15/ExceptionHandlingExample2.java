package sub15;

public class ExceptionHandlingExample2 {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("javja.lang.String 클래스가 존재합니다.");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();			
		}
		System.out.println();
		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("정상적인 프로그램 종료..");
	}
}
