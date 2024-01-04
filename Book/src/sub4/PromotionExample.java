package sub4;

class A{
	
}
class B extends A{
	
}
class C extends A{
	
}
class D extends B{
	
}
class E extends C{
	
}


public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1= b;//모두 다 A를 상속 받고 있어서 A로 타입변환이 가능함.
		A a2= c;
		A a3= d;
		A a4= e;
		
		//B b3=e;//요 두개는 상속 관계가 아니다. 타입변환 안됨
		
		//C c2=d;
		
	}

}
