import java04_oop.MyData;

public class ProtectedTestMain extends MyData{
	
	public ProtectedTestMain() {}
	
	public void start() {
		
		username = "안중근";
		System.out.println(getUsername());
		setUsername("윤봉길");
		System.out.println(username);
		
		
	}

	public static void main(String[] args) {
		new ProtectedTestMain().start();

	}

}
