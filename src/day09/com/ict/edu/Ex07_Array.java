package day09.com.ict.edu;

import java.util.Arrays;

public class Ex07_Array {
	public static void main(String[] args) {
		//가장 큰 값과 가장 작은 값 구하기
int[] su={90,87,-20,120,67,23,40,53};
//오름차순
Arrays.sort(su);
//new int [2][3];고정길이,가변길이 
System.out.println("가장 작은 값:"+su[0]);
System.out.println("가장 큰 값:"+su[su.length-1]);
//다차원 가변길이 고정길이로 나뉘어진다. 
}
}
