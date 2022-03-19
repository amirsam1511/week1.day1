package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 13;
		boolean flag = false;
		for(int i=0;i<value/2;i++) {
			if(value%2==0) {
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not a Prime");
		}

	}

}
