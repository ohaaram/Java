package sub8;


//가이드라인이라고 생각하면 된다.
public interface RmoteControl {
	public void powerOn();//어차피 추상클래스라 abstract를 안써도 된다.
	public void powerOff();
	
	public void chUp();
	public void chDown();
	
	public void soundUp();
	public void soundDown();
}
