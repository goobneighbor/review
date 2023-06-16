package java04_oop;

public class InheritanceMain {

	public static void main(String[] args) {
		
		CCC c =  new CCC();
		System.out.println(c.getData());
		
		
		BBB b = new CCC();
		System.out.println(b.getData());
		
		Object obj = new CCC();
		
		CCC c2 = (CCC) obj;
		System.out.println(c2.getData());
		
		MyData data = new MyData();
		data.username = "이순신";
		System.out.println(data.getUsername());
		
	}

}
