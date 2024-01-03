package sub3;

public class Calc {
	
	//싱글톤 객체 생성 : 해당 클래스 내에서 클래스를 생성
	//싱글톤은 여기서부터
	private static Calc instace = new Calc();	
	public static Calc getInstace() {
		return instace;
	}
	private Calc() {}//인스턴스 생성을 하지못하도록 private로 막아놓는다.
	//여기까지 세트이다.
	
	
	public int plus(int x, int y)
	{
		return x+y;
	}
	public int mius(int x, int y)
	{
		return x-y;
	}
	public int mulit(int x, int y)
	{
		return x*y;
	}
	public int div(int x, int y)
	{
		return x/y;
	}

}
