package day05.com.ict.edu;

public class Homework {
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
		// 2.  for 문으로 플기
				// 0 0 0 0
				// 0 0 0 0
				// 0 0 0 0
				// 0 0 0 0
				for (int i = 1; i < 17; i++) {
					System.out.print("0 ");
					if (i % 4 == 0) {
						System.out.println();
					}
				}
				//3.  이중 for 문으로 풀기 
				//1  0  0  0
				//0  1  0  0
				//0  0  1  0
				//0  0  0  1
				for(int i=0;i<4;i++) {
					for (int j=0; j<4;j++) {
				if(i==j) {
					System.out.print("1 ");
				} else {
				System.out.print("0 ");
					}
				}
				System.out.println();
		}
				//4.   1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,    몇까지 더해야 총합이 100이상이 되는지 구하시오(for문)	
				int sum = 0;
		        int n = 1;

		        while (sum < 100) {
		            if (n % 2 == 0) {
		                sum -= n;
		            } else {
		                sum += n;
		            }
		            n++;
		        }

		        System.out.println("100 이상이 되는 최소한의 항의 개수: " + n);
		        int a = 4; // 출력할 줄 수
				for (int i = 1; i <= a; i++) { // 총 i개의 별을 출력할 줄 번호
				    for (int j = 1; j <= i; j++) { // 현재 줄에서 j번째 별 출력
				        System.out.print("* ");
				    }
				    System.out.println(); // 한 줄 출력 후 줄바꿈
				}
				
				int b = 4; // 출력할 줄 수
				for (int i = 1; i <= b; i++) { // 총 i개의 별을 출력할 줄 번호
				    for (int j = 1; j <= b-i; j++) { // 공백 출력
				        System.out.print("  ");
				    }
				    for (int k = 1; k <= i; k++) { // 현재 줄에서 k번째 별 출력
				        System.out.print("* ");
				    }
				    System.out.println(); // 한 줄 출력 후 줄바꿈
				}
				
				
}
} 