package week1.day1;

public class VariableExample {
	
	String mobileModel = "Iphone";
	float mobileWeight = 8.5F;
	boolean isFullCharged = true;
	int mobileCost = 80000;
	
	public static void main(String[] args) {
		
		VariableExample obj = new VariableExample();
		System.out.println("Model Number is "+ obj.mobileModel);
		System.out.println("Mobile Weight is "+obj.mobileWeight);
		System.out.println("Is Mobile is Fully Charged "+obj.isFullCharged);
		System.out.println("Mobile Cost is "+obj.mobileCost);
	}
	

}
