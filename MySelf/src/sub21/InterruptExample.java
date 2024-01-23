package sub21;

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread();
		thread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("메인에서의 인터럽트");
		}
		thread.interrupt();
	}

}
