package day06.com.ict.edu;

public class Ex05_break_continue3 {
	public static void main(String[] args) {
		//break label:레이블이 지정한 블록 탈출 
		//continue label: 레이블이 지정한 블록의 증감식으로 이동
		
	for (int i = 1; i < 4; i++) {
		System.out.println("1111111");
		for (int j = 1; j < 6; j++) {
			System.out.println("i="+i+",j="+j);
		}
		System.out.println("2222222");
	}
	System.out.println("================");
	
	//레이블(레이블 다음에는 무조건 반복문이 와야 한다)
	
	esc://변수 지정하면 안된다.
		
	for (int i = 1; i < 4; i++) {
		System.out.println("1111111");
		for (int j = 1; j < 6; j++) {
			if(i==2)break esc;
			System.out.println("i="+i+",j="+j);
		}
		System.out.println("2222222");
	}
	System.out.println("================");
	esc://변수 지정하면 안된다.
		
		for (int i = 1; i < 4; i++) {
			System.out.println("1111111");
			for (int j = 1; j < 6; j++) {
				if(j==2)break esc;//참일때만 한다.
				System.out.println("i="+i+",j="+j);
			}
			System.out.println("2222222");
		}
		System.out.println("==================");
		
		esc:
		for (int i = 1; i < 4; i++) {
			System.out.println("1111111");
			for (int j = 1; j < 6; j++) {
				if(i==2)continue esc;
				System.out.println("i="+i+",j="+j);
			}
			System.out.println("2222222");
		}
		System.out.println("=======continue-1=========");
		
		esc://변수 지정하면 안된다.
		for (int i = 1; i < 4; i++) {
				System.out.println("1111111");
				for (int j = 1; j < 6; j++) {
					if(j==2)continue esc;//참일때만 한다.
					System.out.println("i="+i+",j="+j);
				}
				System.out.println("2222222");
			}
		System.out.println("========continu-2 ==========");
		
	}	
 }

