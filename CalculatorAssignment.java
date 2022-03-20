package week1.day2;

public class CalculatorAssignment {
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	public double mul (double num1, double num2) {
		return num1 * num2;
	}

	public float div (float num1, float num2) {
		return num1 / num2;
	}
	public static void main(String[] args) {
		CalculatorAssignment cal = new CalculatorAssignment();
		System.out.println(cal.add(10, 5));
		System.out.println(cal.sub(2022, 1995));
		System.out.println(cal.mul(5.5, 3.25));
		System.out.println(cal.div(9, 3));

	}

}
