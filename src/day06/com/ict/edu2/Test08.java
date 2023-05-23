package day06.com.ict.edu2;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//이름, 국어, 영어, 수학를 입력 받아서
//총점, 평균, 학점을 구하고 
		
//이름, 총점, 평균, 학점을 출력하는 코딩 
//(평균은 소숫점 첫째자리까지 구하자)
		System.out.println("이름:");
		String name = scan.next();
		System.out.println("이름:" + name);
		
		System.out.println("국어:");
		
		int kor=0; 
		kor = scan.nextInt();
		System.out.println("국어:" + kor);
		
		System.out.println("영어:");
        int eng=0;
        eng = scan.nextInt();
        System.out.println("영어:" + eng);
        
       System.out.println("수학:");
        int math=0;
        math = scan.nextInt();
        System.out.println("수학:" + math);
        
        int sum=kor+eng+math;
        System.out.println("총점:"+sum);
		
		
		double avg=(sum*10)/3 / 10.0;
		System.out.println("평균:"+avg);
		
        
		
		if(avg>=90) {
			System.out.println("A학점");
		}else if(avg>=80) {
			
			System.out.println("B학점");
		}else if(avg>=70) {
			System.out.println("C학점");
		}
			else{
		System.out.println("F학점");
			}
	}
	
}
