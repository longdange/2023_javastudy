package day11.com.ict.edu;

public class Ex07_method {
int sum=0;
double avg=0.0;
String hak="";
public void getSum(int kor,int eng,int math) {
	sum=kor+eng+math;
	
}
public void getAvg(int k1) {
	avg=(int)(k1/3.0*10)/10.0;
}
public void getAvg() {
	avg=(int)(sum/3.0*10)/10.0;
}
public void getHak() {
	if(avg>=90) {
		hak="A학점";
		
	}else if(avg>=80) {
		hak="B학점";
		
	}else if(avg>=70) {
		hak="C학점";
		
	}else {
		hak="F학점";
	}
	
}
}
