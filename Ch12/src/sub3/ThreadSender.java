package sub3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ThreadSender extends Thread{
private Socket socket;
	
	public ThreadSender(Socket socket) {
		this.socket=socket;
	}
	@Override
	public void run() {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//키보드로 내용 받기
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String msg = br.readLine();//읽어드림.
				
				if(msg.equals("bye")) {//bye를 입력하면 멈춤.
					break;
				}
				writer.println(msg);
				writer.flush();
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
