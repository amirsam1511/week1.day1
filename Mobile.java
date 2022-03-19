package week1.day1;

public class Mobile {
	
	public void makeCall() {
		System.out.println("Make a Call");
	}
	
	public void sendMsg() {
		System.out.println("Send a Message");
	}
	
	public static void main(String[] args) {
		System.out.println("Mobile Phone");
		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendMsg();
	}

}
