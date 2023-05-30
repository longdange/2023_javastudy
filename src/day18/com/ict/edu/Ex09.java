package day18.com.ict.edu;

import java.util.TreeSet;

public class Ex09 {
public static void main(String[] args) {
	TreeSet<Integer> lotto=new TreeSet<>();
	for (int i = 0; i < 6; i++) {
		int su=(int)(Math.random()*45)+1;
		if(!lotto.add(su)) {
			i--;
		}
	}
	System.out.println(lotto);
	
}
}
