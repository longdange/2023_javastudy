package day11.com.ict.edu;

public class Ex05_Animal {
	//생존 여부
	boolean live;
	//나이
	int age;
	//이름
	String name;
	
	//[접근제한자][메서드종류]반환형 매서드이름([인자=매개변수]) {실행할 내용}
	//생존 여부를 변경하는 매서드
	public void setLive(boolean k1) {
		live=k1;
	}
	//생존 여부를 반환하는 매서드
	public boolean getLive() {
		return live;
	}
	//이름를 변경하는 매서드
	public void setName(String k1) {
		name=k1;
		
	}
	//이름를 반환하는 매서드
    public String getName () {
    	
    	 return name;
    }
	//나이를 변경하는 매서드
	public void setAge(int k1) {
	 age=k1;
	}
	//나이를 반환하는 매서드
	public int getAge() {
		return age; 
	}
	//이름,나이,생존여부 한 번에 변경하자
	public void play(String s1,int s2,boolean s3) {
		name=s1;
		age=s2;
		live=s3;
		
	}
	
	public void play(int s2,String s1,boolean s3) {
		name=s1;
		age=s2;
		live=s3;
		
	}
	public void play(boolean s3,int s2,String s1) {
		name=s1;
		age=s2;
		live=s3;
		
	}
	//이름,나이,생존여부 한 번에 출력하기 
	public void prn() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		if(live) {
		System.out.println("생존여부:살았음");
	}else {
		System.out.println("생존여부:죽었음");
	}
		
}
	
	
	
}	

