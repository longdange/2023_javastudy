package day06.com.ict.edu2;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//원하는 회수를 입력 받고 
//숫자를 입력 받아서 
//입력 받은 숫자가 홀수 인지, 짝수인지 판별하는 코딩
		System.out.print("원하는 반복 횟수:");

		int su = scan.nextInt();
		int loop = su;
		
		for (int i = 0; i < loop; i++) {
			System.out.print("원하는 숫자:");
			su = scan.nextInt();
			if (su % 2 == 0) {
				System.out.println("입력 받은 숫자는 짝수입니다");
			} else {
				System.out.println("입력 받은 숫자는 홀수입니다");
			}

		}
	}
}