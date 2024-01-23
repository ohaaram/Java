package sub21;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("작업 내용을 저장함..");
	}

	@Override
	public void run() {
		while (true) {//Thread.sleep으로 1초 잠들었따가 save를 해준다.
			try {
				Thread.sleep(1000);//1초 잠들어있다가
			} catch (InterruptedException e) {
				break;
			}
			save();//save됨.
		}
	}

}
