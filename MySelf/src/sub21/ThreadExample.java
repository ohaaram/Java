package sub21;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread = new MovieThread();
		thread.setDaemon(true);
		thread.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		thread.interrupt();
		System.out.println("메인을 종료합니다.");
	}

}
