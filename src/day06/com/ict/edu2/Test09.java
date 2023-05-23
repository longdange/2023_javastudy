package day06.com.ict.edu2;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
//		첫번째 숫자 받기
//		두번째 숫자 받기
//		연산자 받기("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ")
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 숫자:");
		int f= scan.nextInt();
		System.out.println("두 번째 숫자:");
		int s= scan.nextInt();
		System.out.println("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ");
		int p=scan.nextInt();
		if(p==1) {
			System.out.println(f+"+"+s+ "="+(f+s));
		}
		else if(p==2) {
			System.out.println(f+"-"+s+ "="+(f-s));
		}
		
		else if(p==3) {
			System.out.println(f+"*"+s+ "="+(f*s));
		}
		else if(p==4) {
			System.out.println(f+"/"+s+ "="+(f/s));
		}

}
}
