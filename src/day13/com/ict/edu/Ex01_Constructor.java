package day13.com.ict.edu;

public class Ex01_Constructor {
//this와 this():자기 자신을 가지고 있는 생성자 
//this: 객체 내부에서 객체 자신을 지정하는 예약어
//      지역 변수와 전역 변수 이름이 같을 때 전역변수 앞에 this()를 붙인다.
//this():객채 내부에서 객체 자신의 생성자를 지칭하는 예약어
	private String name="홍길동";
	private int age=34;
	public Ex01_Constructor() {
		//생성자가 다른 생성자 호출 (반드시 첫번째 줄에서)
		this("임꺽정");//첫 번째 위치에 있어야 한다. 
		System.out.println("기본생성자:"+this);	
//생성자에서 매서드 호출
//	prn();
//	this.prn();
	}   
	//생성자 오버로딩 (같은 이름의 생성자가 2개 이상 있음)
	public Ex01_Constructor(String name) {
	   this.name=name;
	   
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void prn() {
		
	}
}
