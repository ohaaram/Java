package sub2;

/*
 * 날짜 : 2024/01/15
 * 이름 : 오아람
 * 내용 : Java Thread 상태 실습하기
 */
class ChildThread extends Thread {
	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("i : " + i);

			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("자식 스레드 종료...");
	}
}

public class ThreadjoinTest {
	public static void main(String[] args) {
		ChildThread ct =  new ChildThread();
		
		//자식 스레드 실행.main 스레드의 일시정지 상태
		ct.start();
		
		//자식 스레드 종료시까지 main스레드가 대기
		//main 스레드가 살아있어야지 자식 스레드가 의미가 있음.
		try {
			ct.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 스레드(프로그램) 종료....");

	}

}
