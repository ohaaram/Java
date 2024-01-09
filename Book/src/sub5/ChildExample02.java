package sub5;

public class ChildExample02 {
	
	public static void main(String[] args) {
		
		Parent02 parent = new Child02();
		Child02 child =  new Child02();
		
		//Child02 child=(Child02)parent;

		
		parent.field1="data1";
		parent.method1();
		parent.method2();
		
		child.field2="test";
		child.method3();
		
		
	}

}
