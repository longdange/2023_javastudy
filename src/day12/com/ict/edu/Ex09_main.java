package day12.com.ict.edu;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		
		//Ex08_method로 만들어진 객체만 저장하는 배열(객체형 배열 = 참조자료형 배열)
		
		Ex09_Constructor[] arr = new Ex09_Constructor[5];
		
		//arr[0] = person Ex08_method 객체
		//arr[1] = person Ex08_method 객체
		//arr[2] = person Ex08_method 객체
		//arr[3] = person Ex08_method 객체
		//arr[4] = person Ex08_method 객체
		
		
		for (int i = 0; i < arr.length; i++) {
			
			
//			String name = person.getName();
//			int kor = person.getKor();
//			int eng = person.getEng();
//			int math = person.getMath();
//			int sum = person.getSum();
//			double avg = person.getAvg();
//			String hak = person.getHak();
//			int rank = person.getRank();
			
			System.out.print("이름:");
			String name= scan.next();
			System.out.print("국어:");
			int kor=scan.nextInt();
			System.out.print("영어:");
			int eng =scan.nextInt();
			System.out.print("수학:");
			int math=scan.nextInt();
			
			Ex09_Constructor person=new Ex09_Constructor(name, kor, eng, math);
			arr[i]=person;
			
		
		}
		
		//순위
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].getSum()<arr[j].getSum()){
					arr[i].setRank(arr[i].getRank()+1);
				}
			}
		}
		
		
		Ex09_Constructor tmp= new Ex09_Constructor("PPP",40,40,40);
		
		//정렬
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].getRank()<arr[j].getRank()) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				}
			}
		}
		
		//출력
		System.out.println("이름\t국어\t영어\t수학\t총합\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName()+"\t");
			System.out.print(arr[i].getKor()+"\t");
			System.out.print(arr[i].getEng()+"\t");
			System.out.print(arr[i].getMath()+"\t");
			System.out.print(arr[i].getSum()+"\t");
			System.out.print(arr[i].getAvg()+"\t");
			System.out.print(arr[i].getHak()+"\t");
			System.out.println(arr[i].getRank());
		}
		
	}


	}