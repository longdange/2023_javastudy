package network.com.ict.edu8;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class CP_Client extends Thread{
	
	Socket s;
	CM_Server server;
	ObjectInputStream in;
	ObjectOutputStream out;
	String ip;
	
	//cm_server의 소켓과, this(서버)
	public CP_Client(Socket s, CM_Server server) {
		this.s = s;
		this.server = server;
		try {
			in = new ObjectInputStream(s.getInputStream());
			//소켓을 입력 받아서 읽을수 있도록
			out = new ObjectOutputStream(s.getOutputStream());
			ip = s.getInetAddress().getHostAddress();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	@Override
	public void run() {
		esc:while (true) {
			try {
				Object obj = in.readObject();
				if(obj != null) {
					VO vo = (VO)obj;
					switch (vo.getCmd()) {
					case 0:
						out.writeObject(vo);
						out.flush();
						break esc;
					case 1: // 채팅
						vo.setMsg(ip+":" +vo.getMsg());
						server.sendMsg(vo);
						break;
					case 2: // 그림 그리기
						server.picture(vo);
						break;

					default:
						break;
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}// 무한반복 벗어나서
		// 현재 객체를 삭제
		server.removeClient(this);
		try {
			out.close();
			in.close();
			s.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
