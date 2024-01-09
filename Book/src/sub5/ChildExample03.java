package sub5;

public class ChildExample03 {
	public static void main(String[] args) {
		Prent03 parent = new Child03();
		
		parent.field1="data1";
		parent.method1();
		parent.method2();
		
		
		Child03 child = (Child03)parent;
		Child03 child2 = new Child03();
		
		child.field2= "data2";
		child.method3();
	}

}
