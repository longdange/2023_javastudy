package day05.com.ict.edu;

public class Test06 {
	public static void main(String[] args) {
		
	
	int n = 4; // 출력할 줄 수
	for (int i = 1; i <= n; i++) { // 총 i개의 별을 출력할 줄 번호
	    for (int j = 1; j <= n-i; j++) { // 공백 출력
	        System.out.print("  ");
	    }
	    for (int k = 1; k <= i; k++) { // 현재 줄에서 k번째 별 출력
	        System.out.print("* ");
	    }
	    System.out.println(); // 한 줄 출력 후 줄바꿈
	}
}}
