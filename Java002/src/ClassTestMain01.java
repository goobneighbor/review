
public class ClassTestMain01 {
	
	public static void main(String[] args) {
		
		ClassTest ct = new ClassTest();
		
		ct.method2();
		
		String result = ct.method2(11, 22);
		System.out.println("result->"+result);
		
//		ct.myName= "홍은채";
		
		System.out.println("myName->"+ct.getMyName());
		System.out.println("myName->"+ct.getMyName());
	}
}
