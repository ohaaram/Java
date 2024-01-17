package sub3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ThreadReceiver extends Thread{
	
	
	private Socket socket;
	
	public ThreadReceiver(Socket socket) {
		this.socket=socket;
	}
	@Override
	public void run() {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//소켓으로 메시지를 읽어오기
			
			while(true) {
				String msg = br.readLine();
				
				if(msg==null) {//메시지가 없으면 finally로 가서 소켓 닫기
					break;
				}
				System.out.println(msg);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
