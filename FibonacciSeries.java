package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range = 7;
		int firstNum = 0;
		int secNum = 1;
		int sum;
		
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i=1; i<range;i++) {
			sum = firstNum + secNum;
			System.out.println(sum);
			firstNum = secNum;
			secNum = sum;
			
		}

	}

}
