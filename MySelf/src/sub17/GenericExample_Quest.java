package sub17;

public class GenericExample_Quest {
	public static void main(String[] args) {
		Box box1=new Box<>();
		box1.content="100";
		
		Box box2= new Box<>();
		box2.content="100";
		
		Box box3= new Box<>();
		box3.content=100;
		
		boolean result1 = box1.compare(box2);
		System.out.println("result1 : "+result1);
		System.out.println(box1);
		
		int hbox1 = box1.hashCode();
		int hbox2 = box2.hashCode();
		
		boolean result2 = box1.equals(box2);
		/*
		 * 이건 hashcode값을 비교하기 때문에 false가 나온다.
		 * 
		 * hashcode값
		 * 해시는 데이터를 고정된 크기의 문자열로 변환하는 과정을 나타냅니다. 
		 * 
		 * 주소값은 메모리 위치를 가리키는 값이며,
		 * 해시값은 데이터의 내용을 나타내는 고유한 값입니다. 
		 * 		
		*/
		System.out.println("result2 : "+result2);
		System.out.println(box2);
		
		boolean result3 = box1.content.equals(box2.content);
		System.out.println("result3 : "+result3);
		
		boolean result4 = box1.compare(box3);
		System.out.println("result4 : "+result4);
	}
}
