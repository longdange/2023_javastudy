
package network.com.ict.edu5;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

//보내는애
public class ChatServer {
	ServerSocket ss = null;
	ArrayList<CopyClient> list = null; //자료형이 CopyClient
	
	
	public ChatServer() {
		list = new ArrayList<>(); //생성하자마자 list만듬
		try {
			ss = new ServerSocket(7778);
			System.out.println("서버 시작..!");
			
			//메서드 실행?
			exe();
		} catch (Exception e) {
		
		}
	}
	//단일 쓰레드
	public void exe() {
		while(true) {
			try {
				Socket s = ss.accept(); //접속자 정보를 s가 가지고있음
				CopyClient cc = new CopyClient(s, this);
				cc.start();
				list.add(cc);
				sendMsg(" ** " + cc.ip + "님 입장 **");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public void sendMsg(String msg) {
		//리스트안에 있는 모든 클라이언트에게 받은 메세지를 보내자
		for (CopyClient k : list) {
			k.out.println(msg);
		}
	}
	public void removeClient(CopyClient cc) {
		list.remove(cc);
	}
	
	public static void main(String[] args) {
		new ChatServer();
	}
}
