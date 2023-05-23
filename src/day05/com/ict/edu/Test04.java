package day05.com.ict.edu;

public class Test04 {
	public static void main(String[] args) {
		//4.   1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,    몇까지 더해야 총합이 100이상이 되는지 구하시오(for문)	
		int sum = 0;
        int n = 1;

        while (sum < 100) {
            if (n % 2 == 0) {
                sum -= n;
            } else {
                sum += n;
            }
            n++;
        }

        System.out.println("100 이상이 되는 최소한의 항의 개수: " + n);
	}

	
}
