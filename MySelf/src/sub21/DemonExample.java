package sub21;

public class DemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread =new AutoSaveThread();
		autoSaveThread.setDaemon(true);//데몬스레드로 만들었네..메인이 죽으면 같이 죽음
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
	System.out.println("메인 스레드 종료..");	
	}

}
