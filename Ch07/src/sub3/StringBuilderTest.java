package sub3;

/*
 * 날짜 : 2024/01/09
 * 이름 : 오아람
 * 내용 : Java StringBuilder 클래스 실습
 */


public class StringBuilderTest {
	public static void main(String[] args) {
		
		//String 불변성(immutable)
		String str="Hello";
		System.out.println("str 객체 주소 : "+System.identityHashCode(str));
		
		str+=" World";
		System.out.println("str 객체 주소 : "+System.identityHashCode(str));
		
		System.out.println("Str :" +str);//->새로 객체를 생성하여 주소값이 바뀐다. 그전에 있었던 주소값에 있던 객체는 버려짐(메모리 낭비)
		
		//String의 immutable 단점을 개선한 StringBuilder
		StringBuilder sb= new StringBuilder("Hello");
		
		System.out.println("str 객체 주소 : "+System.identityHashCode(str));
		
		sb.append(" World");
		System.out.println("str 객체 주소 : "+System.identityHashCode(str));
		
		System.out.println("Str :" +sb);
		
	}

}
