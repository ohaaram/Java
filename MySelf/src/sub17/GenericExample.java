package sub17;

public class GenericExample {
	
	
	//제네릭 메서드(<T>가 리턴타입 앞에 붙는다)
	public static <T> Box01<T> boxing(T t){
		Box01<T> box =new Box01<T>();
		box.set(t);
		return box;		
	}
	public static void main(String[] args) {
		Box01<Integer> box1 = boxing(100);
		int intValue =box1.get();
		System.out.println(intValue);
		
		Box01<String> box2 = boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
