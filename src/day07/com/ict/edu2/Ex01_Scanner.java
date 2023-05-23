package day07.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 전체횟수,짝수횟수,짝수가 나온 퍼센트 구하기(소수점 첫째짜리 까지 구하기)
		int count = 0;
		int even = 0;
		int i = 0;
		String str = "";

		esc: while (true) {
			System.out.print("숫자입력: ");
			int su = scan.nextInt();

			if (su % 2 == 0) {
				str = "짝수";
				even++;
			} else {
				str = "홀수";
			}

			count = count + 1;

			System.out.println(su + "는 " + str + "입니다.");

			while (true) {
				System.out.println("계속할까요?(1.yes, 2.no)>>");
				i = scan.nextInt();

				if (i == 1)
					continue esc;
				if (i == 2)
					break;
				if (i >= 3 || i < 1)
					System.out.println("잘못 입력했습니다");
			}
			if (i == 2)
				break;

		}

		System.out.println("퍼센트: " + (int) (even * 100 / count) + "%");

	}
}
