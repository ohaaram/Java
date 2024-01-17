package sub5;

class ChildThread extends Thread {
	public void run() {

		for (int i = 1; i <= 100; i++) {
			System.out.println("ct1 : " + i);
			Thread.yield();
		}
	}
}

class ChildThread02 extends Thread {
	public void run() {

		for (int i = 1; i <= 100; i++) {

			System.out.println("ct2 : " + i);
		}
	}
}

public class interrupt {
	public static void main(String[] args) {
		ChildThread ct1 = new ChildThread();
		ChildThread02 ct2 = new ChildThread02();

		ct1.start();
		ct2.start();

		try {
			ct1.join();
			ct2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main 스레드 종료....");
	}

}
