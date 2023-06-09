package day11.com.ict.edu;

public class Ex05_AnimalTest {
	public static void main(String[] args) {
		//객체 생성
		Ex05_Animal animal=new Ex05_Animal();
		//이름 큰뿔소
		animal.setName("큰뿔소");
		//나이 3살
		animal.setAge(3);
		//생존여부:살아있음
		animal.setLive(true);
		//결과 출력
		//System.out.println("이름:"+animal.getName());
		String m1=animal.getName();
		System.out.println("이름:"+m1);
		int m2=animal.getAge();
		System.out.println("나이:"+m2);
		//System.out.println("나이:"+animal.getAge());
		boolean m3=animal.getLive();
		if(m3) {
			System.out.println("생존여부:살았음");
		}else {
			System.out.println("생존여부:죽었음");
		}
		System.out.println("===============");
		//이름을 펭귄으로 바꾸고 나이를 1살이라고 바꾸고 생존여부 살아있음으로 변경

		animal.setName("펭귄");
		animal.setAge(1);
		animal.setLive(true);
		String p1=animal.getName();
		System.out.println("이름:"+p1);
		int p2=animal.getAge();
		System.out.println("나이:"+p2);
		//System.out.println("나이:"+animal.getAge());
		boolean p3=animal.getLive();
		if(p3) {
			System.out.println("생존여부:살았음");
		}else {
			System.out.println("생존여부:죽었음");
		}
		animal.play(false,14,"엄지");
		animal.prn();
		System.out.println("=========");
		animal.play("까치", 14, true);
		animal.prn();
	}
}
