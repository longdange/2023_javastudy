package day05.com.ict.edu;

public class Test01 {
		public static void main(String[] args) {
			//1. if~ else문 
			
			//농구공 5개씩 한 박스에 들어간다. 
			// 40개면 8상자,  26개면 6상자이다.
			//int k1 = 127개이다. 
			//몇 상자가 필요한가요?
		int k1 =127;
		int ballbox=5;
		if (k1%5==0) {
			System.out.println(k1/ballbox);
		} else {
			System.out.println((k1/ballbox)+1);
		}
}
}

