package sub2;

public class Singleton {
	
	
	//private 접근권한 갖는 정적 필드 선언과 초기화
	private static Singleton singleton = new Singleton();	
	
	private Singleton() {		
	
	}
	public static Singleton getInstace() {
		return singleton;
	}
}
