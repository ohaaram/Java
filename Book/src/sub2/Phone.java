package sub2;

public class Phone {
	protected String model;
	protected String color;
	
	public Phone(String model, String color) {
		this.model=model;
		this.color=color;
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	public void sendVoice(String message) {
		System.out.println("자기 : "+message);
	}
	public void receiveVoice(String message) {
		System.out.println("상대방 : "+message);
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
	public void show() {
		System.out.println("모델 :"+model);
		System.out.println("색상 : "+color);
	}
}
