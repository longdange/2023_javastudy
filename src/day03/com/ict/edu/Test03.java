package day03.com.ict.edu;

public class Test03 {
	public static void main(String[] args) {
		//3989초는 몇 시간,몇 분,몇 초인가?
	int time=3989;
	int h=0;     //시
	int m=0;     //분
	int s=0;     //초
	int res =0;//나머지
	
	 h=time/(60*60);//1시간
	 res=time%(60*60);//389
	 m=res/60;//6분
	 s=res%60;//29초
	System.out.println(+h+"시간");
	System.out.println(+m+"분");
	System.out.println(+s+"초");

	}

}
