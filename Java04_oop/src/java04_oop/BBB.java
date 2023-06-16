package java04_oop;

public class BBB extends AAA {
	int b = 20;
	private int c = 12;
	
	public BBB() {}
	
	//오버라이딩
	public int getData() {
		System.out.println("c="+c);
		return b;
	}
	private String getWelcome() {
		return "안녕";
	}
}
