package day16.com.ict.edu;

public class Ex06_Main {
	public static void main(String[] args) {
		//dog test=new dog();
		//Member내부클래스 만드는 방식으로도 사용 불가
		Ex06_Local test = new Ex06_Local();
		//Ex06_Local.Dog exam=test.new Dog();
		//메서드 안에 있으므로 메서드를 실행해야
		//내부 클래스를 생성할 수 있다.
		test.play();
		
		//메서드가 끝나면 내부클래스도 사라진다.
		
		
}
}
