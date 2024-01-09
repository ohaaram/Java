package sub8;

public class Example {
	
	public static void action(A a) {
		C c = new C();
		a.method1();
		if(a instanceof C)
		{
			c.method2();
		}
	}
	
	
	
	public static void main(String[] args) {
		action(new A());
		action(new B());
		action(new C());
		
	}

}
