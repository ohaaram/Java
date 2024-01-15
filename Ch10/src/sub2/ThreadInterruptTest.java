package sub2;

/*
 * 날짜 : 2024/01/15
 * 이름 : 오아람
 * 내용 : Java Thread 상태 실습하기
 */

class SubThread extends Thread {
	@Override
	public void run() {
		int i = 1;
		try {
			while (true) {
				System.out.println("i : " + i);
				i++;

				sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class ThreadInterruptTest {
	public static void main(String[] args) {
		SubThread sub = new SubThread();
		sub.setName("Sub");

		// 자식 스레드 실행
		sub.start();

		try {
			Thread.sleep(1000 * 10);// main 스레드 10초 일시정지

		} catch (Exception e) {
			e.printStackTrace();
		}
		//자식 스레드 종료
		sub.interrupt();//예외를 발생시켜서 자식스레드의 catch절로 이동.
		System.out.println("Main Thread 종료...");

	}
}
