package sub17;

public class Box <T>{
	
	public T content;
	
	public boolean compare(Box<T> other) {
		boolean result=content.equals(other.content);

		return result;
	}
	//새로 생긴 코드
	public void show() {
		System.out.println(this);
	}		

}
