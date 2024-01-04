package sub8;

/*
 * 날짜:2024/01/04
 * 이름:오아람
 * 내용:Java 인터페이스 실습하기
 */
class Computer {
	public void boot() {
		System.out.println("시스템 부팅...");
	}
	
}
interface Internet{
	public void access();	
}
class Tv extends Computer implements Internet{

	@Override
	public void access() {
		System.out.println("인터넷 접속....");
	}
	public void show() {
		System.out.println("Tv 시청...");
	}
	
}



public class InterfaceTest {
	public static void main(String[] args) {
		
		//인터페이스 예제1 - 표준화된 클래스 설계
		RmoteControl lg =new RmoteLG();
		lg.powerOn();
		lg.chUp();
		lg.soundUp();
		lg.powerOff();
		
		RmoteControl samsug = new RmoteSamsung();
		samsug.powerOn();
		samsug.chDown();
		samsug.soundDown();
		samsug.powerOff();
		
		//인터페이스 예제2 - 유연성(결합도 완화)->다시 해보기!!
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);	
		
		socket.swtichOn();
		socket.swtichOff();
		
		//인터페이스 예제3 - 다중 상속 효과 : 하나는 클래스, 하나는 인터페이스
		
		Tv smartTv = new Tv();//여기서는 Tv를 Computer로 바꾸지 못한다.
		//Computer로 바꾸면 
		smartTv.boot();
		smartTv.access();
		smartTv.show();
		
		
	}

}
