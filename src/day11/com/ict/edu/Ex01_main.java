package day11.com.ict.edu;

public class Ex01_main {
	public static void main(String[] args) {
		//static 객체 생성과 상관없이 호출 가능
		//static 호출법:클래스.변수,클래스이름.메서드
System.out.println(Ex01_method.ki);//178.5
Ex01_method.getAvg();
System.out.println(Ex01_method.ki);//183.5

Ex01_method t1=new Ex01_method();//ctrl+space bar기본생성자
//void를 호출하면 인스턴스 호출 방법 : 참조 변수.변수, 참조 변수.메서드
String n=t1.name;
//변수를 호출하면 
//void는 호출한 곳으로 아무것도 가져오지 않는다.
t1.getTotal();
//total변경된 것을 확인
 int k1=t1.total;//k1이 지역 변수
 System.out.println(n);// 홍길동
 System.out.println(k1);//80+95+85=260;
 //str="korea";//static은 인스턴스 변수를 못 쓴다. 
 System.out.println("===========");
 double k2=Ex01_method.getAvg2();
 System.out.println(k2);//184.2
 
	}
	
}
