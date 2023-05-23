package day04.com.ict.edu;

public class Ex04_if_else {
	public static void main(String[] args) {
		//if ~else문
		//조건식이 참일 때와 거짓일 때 각각 나눠서 처리한다.
		//형식) if(조건식){
		//     조건식이 참일 때 실행할 문장;
		//	   조건식이 참일 때 실행할 문장;
		//   }else{
		//     조건식이 거짓일 때 실행할 문장;
		//     조건식이 거짓일 때 실행할 문장;
		//  }
		
		
		//int k1이 60이상이면 합격 아니면 불합격
		int k1=79;
		String str ="";
		if (k1>=60) {
			str="합격";
		} else {
           str="불합격";
		}
		System.out.println("결과:"+str);
		
		//int k2가 홀수인지,짝수인지 판별하자
		int k2=30;
		if (k2%2==0) {
			str="짝수";
		} else {
            str="홀수";
		}
		System.out.println("결과:"+str);
		
		//char k3가 대문자인지,대문자가 아닌지 판별하자
		char k3='z';
		if (k3>='A'&&k3<='Z') {
			str="대문자";
		} else {
            str="대문자 아님";
		}
		System.out.println("결과:"+str);
		//근무시간이 8시간까지는 시간당 9620원이고
		//8시간을초과한 시간만큼은 1.5배 지급한다.
		//현재 근무한 시간이 10이다.
		//얼마를 받아야는가?
		int time=10;
		int limt=8;
		int dan=9620;
		int pay=0;
	   if (time >limt) {
						pay= limt*dan + (int)((time-limt)*dan*1.5);
					}
	   else {
		   pay=dan*time;
	   }
	   System.out.println("결과:"+pay);
	   
	}
}
