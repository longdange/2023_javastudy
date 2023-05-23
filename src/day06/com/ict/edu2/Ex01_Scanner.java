package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		//Scanner 클래스 : 키보드에 입력된 정보를 받아서 처리하는 클래스
		//system.out =>표준 출력 장치(모니터)
		//system.in =>표준 입력 장치(키보드)
		//회사에서 제공하는 클래스를 사용하기 위해서 import를 해야 된다.
		//class java.lang은 import를 안해도 된다.
		//Scanner는 위치를 가르쳐줘야 한다.
		//ctrl+shift+o.ctrl+space bar
		//jave.lang 패키지 안에 존재하는 클래스는 아무런 제약 없이 사용 가능 (import 안함)
		//java.lang 패키지 외에 존재하는 클래스는 무조건 import를 해야 한다.
		//import 방법)1.클래스이름 뒤에서 ctrl+space
		//           2. ctrl+shift+o
		//java.util은 import를 해야 한다. 
		
		//해당 클래스 커서를 뒤에 놓고 shift+f2 =>해당 클래스 API설명서가 나타난다. 
	Scanner scan= new Scanner(System.in);
		
	System.out.println("이름 : ");
	//.next();입력한 내용을 String으로 처리하는 메소드 
	String name =scan.next();
	System.out.println("받은 내용:"+name);
	
	System.out.println("나이 : ");
	//.next();입력한 내용을 String으로 처리하는 메소드 
	String age =scan.next();
	System.out.println("받은 내용:"+(age+1));
	
	System.out.println("나이 : ");
	//.nextlnt();입력한 내용을 int으로 처리하는 메소드 (문자를 입력하면 오류)
	int age2 =scan.nextInt();
	System.out.println("받은 내용:"+(age2+1));
	//next매소드와 nextline매소드의 차이를 구하시오
	//띄어쓰기미미히
	System.out.println("키:");
	//.nextdouble():입력한 내용을 double으로 처리하는 매서드(문자를 입력하면 오류)
	double ke =scan.nextDouble();
	System.out.println("받은 내용:"+ke);
	
	System.out.println("당신은 남성입니까?(true/false)");
	//.nextboolean():입력한 내용을 boolean으로 처리하는 매서드(숫자 및 다른 문자 입력하면 오류)
	boolean gender = scan.nextBoolean();
	System.out.println("받은 내용:"+gender);
	if (gender) {
		System.out.println("당신은 남성입니다.");
	}else {
		System.out.println("당신은 여성입니다.");
	}
	
	//nextChar()는 존재하지 않는다.그러므로 char는 사용 못함
	
	}
}
