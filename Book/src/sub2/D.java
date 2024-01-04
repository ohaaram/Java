package sub2;
import sub3.A;

public class D extends A{
	public D() {
		super();
	}
	
	public void method() {
		this.field="value";
		this.method();
	}
	
	public void method2() {
		A a = new A();
		a.field="value";
		a.method();
	}

}
