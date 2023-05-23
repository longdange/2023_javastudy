package day05.com.ict.edu;

public class Test02 {
	public static void main(String[] args) {

		// 2. / for 문으로 플기
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

	}
}
