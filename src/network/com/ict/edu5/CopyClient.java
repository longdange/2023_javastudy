package network.com.ict.edu5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

//받는애
public class CopyClient extends Thread{

	Socket s ;
	ChatServer server;
	
	
	BufferedReader in;
	PrintWriter out;
	String ip;
	
	public CopyClient(Socket s, ChatServer server) {//위에 전역변수로 빼주기 후에 this
		//서버에 메서드나 변수를 사용하기위해 this씀
		//보내거나, 삭제하거나, 리스트가 서버에 있어서
		this.s = s;
		this.server = server;
		try {
			//3줄짜리 1줄로 묶음(체인방식)
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream(),true); //자동flush를하기위해 true해줌
			ip = s.getInetAddress().getHostAddress();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				String msg = in.readLine();
				if(msg.equals("exit")) {
					//원격에 있는 실제 클라이언트에게 종료 메세지 보내기
					out.println("~~bye");
					break;
				}
				server.sendMsg(ip + ":" + msg);
			} catch (Exception e) {
			}
		}//무한반복
		try {
			out.close();
			in.close();
			s.close();
			
			//server에 있는 list에서 현재 객체 삭제
			server.removeClient(this);
			
			server.sendMsg(ip + "님 퇴장");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
