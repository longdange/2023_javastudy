package day06.com.ict.edu;

public class Ex02_do_while {
	public static void main(String[] args) {
    /*
     do ~ while문:while문과 같은 반복문
      단,먼저 실행 후 조건식이 붙는다.
      형식)
            초기식;
            do{
            실행문;
            증감식;
            }while(조건식);
            
      
     */
		//0-10까지 출력
	int i=0;
	do {
		System.out.println(i);
		i++;
		
	}
	while (i<11);
			
	//0-10까지 홀수 출력
	i=0;
	do {
		if(i%2==1) {
			System.out.println("i="+i);
		}
		i++;
	}while(i<11);
	
	
	//7단 출력
	i=1; //초기식
	do {
		System.out.println("7*"+i+"="+(7*i));
		i++;//증감식
	}while(i<10);//조건식
	
	
	//0-10사이에서 홀수 일때 누적합
	i=1;//초기식
	int sum=0;
	
	do {
		if(i%2==1) {
			sum=sum+i;
		}
		i++;//증감식
	}while(i<11);//조건식
	
	System.out.println("결과: " +sum);
	System.out.println("======================");
	
	}
}
