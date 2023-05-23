package day19.com.ict.edu;

public class Ex04_Cat implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			//3초간 대기상태
			try {
				Thread.sleep(1000*3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("야옹~~야옹~~");
		}
	}

}
