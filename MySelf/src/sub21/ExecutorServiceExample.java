package sub21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
	public static void main(String[] args) {
		
		//스레드풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		//최대 5개의 스레드로 운영되는 스레드풀을 생성하고 종료
		
		executorService.shutdownNow();//스레드풀 종료
	}

}
