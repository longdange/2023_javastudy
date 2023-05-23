package day16.com.ict.edu;

//static내부 클래스
public class Ex07_static {
	String name="홍길동";
	private int age=24;
	static boolean gender=true;
	public Ex07_static() {
		System.out.println("외부:"+this);
	}
	public void play() {
		int money=1000;
		System.out.println("외부 메서드:"+money);
		System.out.println("외부 메서드:"+money);
	}
	//내부 클래스의 멤버변수가 static이면 class를 static으로 만들어야 한다.
	//권장 사항은 아님(일반 클래스에서는 static사용 못 함)
	public class Inner01{
		String addr="서울 마포구";
		int roomNumber=1;
		static int count=30;
	public Inner01() {
		System.out.println("내부 생성자:"+this);
		
	}
	public void prn() {
		
		System.out.println(addr);
		System.out.println(roomNumber);
		//외부클래스의 멤버도 사용 가능(private사용 가능)
		//System.out.println(name);
		//System.out.println(age);
		System.out.println(gender);
		//외부클래스의 메서드
		//play();
	}
	}
}
