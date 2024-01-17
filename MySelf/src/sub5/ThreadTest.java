package sub5;

class SubThread extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName() + "스레드 실행...");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("스레드 종료....");
	}
}

public class ThreadTest {
	public static void main(String[] args) {

		SubThread st1 = new SubThread();
		SubThread st2 = new SubThread();

		st1.setName("Sub1");
		st2.setName("Sub2");

		st1.start();
		st2.start();
		for (int i = 1; i <= 3; i++) {

			System.out.println("Main 스레드 실행...");
		}

		try {
			st1.join();
			st2.join();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료..");

	}

}
