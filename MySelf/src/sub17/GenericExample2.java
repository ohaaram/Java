package sub17;

/*
 * 제네릭 타입(클래스)
 *  - 클래스 이름 뒤에 <T>가 붙는다
 *  
 * 제네릭 메서드
 *  - 메서드 리턴타입 앞에 <T>가 붙는다.
 */

public class GenericExample2 {
	
	//제네릭 메서드
	public static <T extends Number> boolean compare(T t1,T t2) {
		System.out.println("compare("+t1.getClass().getSimpleName()+", "+
	t2.getClass().getSimpleName()+")");//t1이 어떤타입인지,t2가 어떤타입인지 출력
		
		double v1 = t1.doubleValue();//number타입의 doubleValue()메서드 호출
		double v2 = t2.doubleValue();
		
		return (v1==v2);
	}
	
	public static void main(String[] args) {
		boolean result1=compare(10, 20);
		System.out.println(result1);
		System.out.println();
		
		boolean result2 = compare(4.5, 4.5);
		System.out.println(result2);
		
		boolean result3 = compare(4.5, 20);
		System.out.println(result3);

	}

}
