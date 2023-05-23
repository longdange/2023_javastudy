package day12.com.ict.edu;

public class Ex06_Constructor {
//생성자는 다른 매서드를 호출할 수 있다.
//매서드는 다른 매서드를 호출할 수 있다.
private String name="홍길동";
private int kor=0;
private int eng=0;
private int math=0;
private int sum=0;
private double avg=0.0;
private String hak="";

//생성자
public Ex06_Constructor() {
//gSum(80,85,100);
////생성자에서 다른 메서드 호출 가능
//gAvg();
//gHak();
//prn();
gSum(100,100,100);
}

//총점 구하기
public void gSum(int kor,int eng,int math) {
	sum=kor+eng+math;
	
}
//평균 구하기
public void gAvg() {
	avg=(int)(sum/3*10.0)/10.0;
	
}
//학점 구하기
public void gHak() {
	if(avg>=90) {
		hak="A";
	}else if(avg>=80) {
		hak="B";
	}else if(avg>=70) {
		hak="C";
	}else{
		hak="F";
	}
	
}
//출력하는 매서드
public void prn() {
	System.out.println("이름:"+name);
	System.out.println("총점:"+sum);
	System.out.println("평균:"+avg);
	System.out.println("학점:"+hak);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getKor() {
	return kor;
}
public void setKor(int kor) {
	this.kor = kor;
}
public int getEng() {
	return eng;
}
public void setEng(int eng) {
	this.eng = eng;
}
public int getMath() {
	return math;
}
public void setMath(int math) {
	this.math = math;
}
public int getSum() {
	return sum;
}
public void setSum(int sum) {
	this.sum = sum;
}
public double getAvg() {
	return avg;
}
public void setAvg(double avg) {
	this.avg = avg;
}
public String getHak() {
	return hak;
}
public void setHak(String hak) {
	this.hak = hak;
}

}
