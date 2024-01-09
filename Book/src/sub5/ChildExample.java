package sub5;

public class ChildExample {
	public static void main(String[] args) {
		
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method();
		parent.method2();
		//parent.method3();오버라이딩을 할 수 없어서 호출 불가능
	}

}
