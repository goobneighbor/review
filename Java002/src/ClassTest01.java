
public class ClassTest01 {
	
	int num;
	String myName="이순신";
	
	
	public ClassTest01() {
		System.out.println("ClassTest() 생성자 메소드 실행");
	}
	
	public String method2(int a, int b) {
		int c = a + b;
		return "c="+c;
	}
	
	public void method2() {
		System.out.println("method2");
	}
	
	public String getMyName() {
		method2();
		return myName;
	}
	
}
